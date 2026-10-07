class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> pq = new HashMap<>(); 
       PriorityQueue<Integer> aq = new PriorityQueue<>((a,b)-> pq.get(b)- pq.get(a));
       int[] res = new int[k];

       for(int i=0; i< nums.length; i++){
            pq.put(nums[i], pq.getOrDefault(nums[i],0)+1);
        
       }
       aq.addAll(pq.keySet());
       for(int i=0; i< k; i++){
            res[i] = aq.poll();

       }
       return res;
    }
}
