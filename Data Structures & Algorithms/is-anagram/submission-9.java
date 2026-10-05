class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> stringS = new HashMap<>();
        Boolean isAna = false;
        if(s.length() != t.length()){
            return false;
        }
        else{
        for(int i= 0; i< s.length(); i++){
            stringS.put(s.charAt(i), stringS.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i< t.length(); i++){
            if(stringS.get(t.charAt(i)) == null || stringS.get(t.charAt(i)) == 0){
                return false;
            }
            else{
                stringS.put(t.charAt(i), stringS.getOrDefault(t.charAt(i),0)-1);
            }
        }
        return true;
        
        }
    }
}
