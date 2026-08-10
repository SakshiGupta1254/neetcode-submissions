class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> m = new HashSet<>();
        for(int i : nums){
            if(m.contains(i)){
                return true;
            }
            else{
                m.add(i);
            }
        }
        return false;
        
    }
}