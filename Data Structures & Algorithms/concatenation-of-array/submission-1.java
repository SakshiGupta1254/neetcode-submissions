class Solution {
    public int[] getConcatenation(int[] nums) {
        int l = nums.length;
        int[] newarr = new int[l*2];
        for(int i=0;i<l ;i++){
            newarr[i] = newarr[i+l] = nums[i];
        }
        return newarr;
        
    }
}