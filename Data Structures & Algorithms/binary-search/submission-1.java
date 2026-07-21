class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid = (r-l)/2;;
        while(l<=r){      
            if(target > nums[l] && target <nums[mid]){
            r = mid;
            }
            else if(target > nums[mid] && target <nums[r])
            {
                l=mid;
            }
            else if(target == nums[l]
            ){
                return l;
            }
            else if(target == nums[r]
            ){
                return r;
            }
            else if(target == nums[mid]
            ){
                return mid;
            }
            l++;
            r--;
        }
        return -1;
    }
}
