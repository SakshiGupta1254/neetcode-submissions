class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> airth = new Stack<Integer>();
        for(String t : tokens){
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
                int b = airth.pop();
                int a = airth.pop();
                if( t.equals("+")){
                    airth.push(a+b);
                }
                else if( t.equals("-")){
                    airth.push(a-b);
                }
                else if( t.equals("*")){
                    airth.push(a*b);
                }
                else if( t.equals("/")){
                    airth.push((int)Math.floor(a/b));
                }
            }
            else{
                airth.push(Integer.parseInt(t));
            }
        }
        return airth.pop();
        
    }
}
