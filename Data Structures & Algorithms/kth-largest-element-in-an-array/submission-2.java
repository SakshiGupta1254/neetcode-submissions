class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> max = new PriorityQueue<Integer> ((a,b)->
        Integer.compare(b,a));
        int maxw = 0;
        for(int i=0;i<nums.length;i++)
        {
            max.offer(nums[i]);
        }
        for(int i=0;i<k;i++){
            maxw = max.poll();
        }
        return maxw;
    }

}
