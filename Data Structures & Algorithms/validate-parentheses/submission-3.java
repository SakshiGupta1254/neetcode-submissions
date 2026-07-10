class Solution {
    public boolean isValid(String s) {
        List<String> str = new ArrayList<>();
        boolean a = false;
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' ||
            s.charAt(i) == '['){ 
                str.add(String.valueOf(s.charAt(i)));
            }
            else if(s.charAt(i) == ')') {
                if(str.size() != 0){
                System.out.println(str.get(str.size()-1));
                if(str.get(str.size()-1).equals("(")){
                    str.remove(str.size()-1);
                }
                else{
                return false;
            }
                
            }
            else{
                return false;
            }
            }
            else if(s.charAt(i) == '}'){
                if(str.size() != 0){
                System.out.println(str.get(str.size()-1));
                if(str.get(str.size()-1).equals("{")){
                    str.remove(str.size()-1);
                }
                else{
                return false;
            }
                }
                else{
                return false;
            }
            }
            else if(s.charAt(i) == ']'){
            if( str.size() != 0){
                if(str.get(str.size()-1).equals("[")){
                   str.remove(str.size()-1);
                }
                else{
                return false;
            }
            }
            else{
                return false;
            }
            }
        }
        if(str.size() == 0){
            a = true;
        }
        return a;
    }
}
