class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> m = new HashMap<>();
        Boolean exists = false;
        if(s.length() != t.length()){
            return false;
        }
        else{
        for(int i = 0; i< s.length(); i++){
        int currentCount = m.getOrDefault(s.charAt(i), 0);
        m.put(s.charAt(i), currentCount + 1);
        }
        for(int i = 0; i< t.length(); i++){
        char c = t.charAt(i);
        int count = m.getOrDefault(c, 0);
        if (count == 0) {
        return false; // More of 'c' in t than in s
            }
        m.put(c, count - 1);
        
        }
        for(int i = 0; i< t.length(); i++){
           if(m.get(t.charAt(i)) == 0){
           exists = true;
        } 
        else{
            exists = false;
        }
        }
        }
        return exists;

    }
}
