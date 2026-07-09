class Solution {
    public int removeElement(int[] nums, int val) {
        int[] nums2 = new int[nums.length];
        int size = 0;
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums2[size] = nums[i];
                size++;

            }
        }
        for(int i=0;i<nums2.length;i++){
           nums[i] = nums2[i];  
        }
        return size;
    }
}