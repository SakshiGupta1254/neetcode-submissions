class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int prevCount = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                prevCount++;
                count = Math.max(count,prevCount);
            }
            else{
                prevCount = 0;
            }
            
        }
        
        return count;
        
    }
}