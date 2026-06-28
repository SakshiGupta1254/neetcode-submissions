class Solution {
    public String decodeString(String s) {
        Stack<String> string = new Stack<>();
        Stack<Integer> count = new Stack<>();
        StringBuilder cur = new StringBuilder();
        int k=0;
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                k=k*10+(c-'0');
            }
            else if(c=='['){
                string.push(cur.toString());
                count.push(k);
                cur = new StringBuilder();
                k=0;
            }
            else if(c==']'){
                String decodedInner = cur.toString();
                cur = new StringBuilder(string.pop());
                int repeatCount = count.pop();
                for(int i=0; i<repeatCount;i++){
                    cur.append(decodedInner);
                }
            }
            else{
                cur.append(c);
            }
        }
        return cur.toString();
    }
}