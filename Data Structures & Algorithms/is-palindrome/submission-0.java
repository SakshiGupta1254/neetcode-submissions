class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        
        String d = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int r = d.length()-1;
        while(l<r){
            if(d.charAt(l) == d.charAt(r))
            {
            l++;
            r--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
