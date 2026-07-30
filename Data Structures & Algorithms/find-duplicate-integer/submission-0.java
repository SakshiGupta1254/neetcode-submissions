class Solution {
    public int findDuplicate(int[] nums) {
      HashSet<Integer> h = new HashSet<>();
      for(int n : nums){
        if(!h.contains(n)){
            h.add(n);
        }
        else{
            return n;
        }
      }
      return -1;
    }
}
