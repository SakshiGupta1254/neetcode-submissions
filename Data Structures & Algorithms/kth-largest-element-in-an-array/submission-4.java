class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> max = new PriorityQueue<Integer> ();
        for(int i=0;i<nums.length;i++)
        {
            max.offer(nums[i]);
            if(i>= k){
                max.poll();
            }
        }
        return max.poll();
    }

}
