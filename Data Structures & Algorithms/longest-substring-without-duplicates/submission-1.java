class Solution {
    public int lengthOfLongestSubstring(String s) {
        int a = 0;
        int count =0;
        HashSet<String> d = new HashSet<>();
        for(int i=0 ;i< s.length() ; i++){
            
            while(d.contains(String.valueOf(s.charAt(i)))){
                d.remove(String.valueOf(s.charAt(a)));
                a++;
            }
            
     d.add(String.valueOf(s.charAt(i)));
    count = Math.max(count, i-a+1);
        }
        return count;
    }
}
