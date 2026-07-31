class Solution {
    public boolean isPalindrome(String s) {
        String d = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int l =0;
        int r = d.length()-1;
        boolean k = true;
        while(l<r && d.length() >1){
            if(d.charAt(l) == d.charAt(r)){
               k= true;
            }
            else{
                return false;
            }
            l++;
            r--;
        }
        return k;
    }
}
