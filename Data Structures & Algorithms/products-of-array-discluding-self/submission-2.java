class Solution {
    public int[] productExceptSelf(int[] nums) {
        //[1,1,2,8]
        //[48,24,6,1] 
        //[48,24,12,8]
        int[] pre = new int[nums.length];
        pre[0] = 1;
        int suff = 1;
        for(int i =1;i<nums.length;i++){
            pre[i] = pre[i-1]*nums[i-1];
        }
        for(int i = nums.length-1;i>=0;i--){
            pre[i] = pre[i]*suff;
            suff = suff*nums[i];
        }
        return pre;
    }
}  
