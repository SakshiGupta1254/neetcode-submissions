class Solution {
    public void sortColors(int[] nums) {
        int[] counts = new int[3];
        for(int n: nums){
            counts[n] += 1;
        }
        int b =0;
        for(int i=0; i<counts.length; i++){
            for(int j=0; j<counts[i]; j++){
                nums[b] = i;
                b++;
            }
        }
        System.out.println(nums);
        
    }
}