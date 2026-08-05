class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int maxSum = nums[0];

        for(int  i : nums){
            curr = Math.max(curr,0);
            curr += i;
            maxSum = Math.max(curr, maxSum);
        }
        return maxSum;
    }
}
