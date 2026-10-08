class Solution {
    public int[] productExceptSelf(int[] nums) {
        //[1,1,2,8]
        //[48,24,6,1] 
        //[48,24,12,8]
        int[] pre = new int[nums.length];
        Arrays.fill(pre,1);
        int[] post = new int[nums.length];
        Arrays.fill(post,1);
        int[] result = new int[nums.length];
        for(int i =0;i<nums.length-1;i++){
            pre[i+1] = pre[i]*nums[i];
        }
        for(int i = nums.length-1;i>0;i--){
            post[i-1] = nums[i]*post[i];
        }
        for(int i =0;i<nums.length;i++){
            result[i] = pre[i]*post[i];
        }
        return result;
    }
}  
