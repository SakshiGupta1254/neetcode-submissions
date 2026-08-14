class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int l = 0;
        int r = 0;
        Arrays.sort(nums);
        List<List<Integer>> rw = new ArrayList<>();
        for(int i =0; i< nums.length-2 ;i++){
            if(i >0 && nums[i] == nums[i-1]){
                continue;
            }else{
            l = i+1;
            r = nums.length-1;
            while( l < r){
                int sum = nums[l]+nums[r]+nums[i];
                if(sum == 0){
                    
                    rw.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1])
                        l++;

                    // Skip duplicate third elements
                    while (l < r && nums[r] == nums[r + 1])
                        r--;
                    
                }
                else if( sum < 0){
                    l++;
                }
                else if(sum > 0){
                    r--;
                }
            }
            
                
            }
        }
        return rw;
    }
}
