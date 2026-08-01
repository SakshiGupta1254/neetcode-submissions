class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int leftMax =0;
        int rightMax = 0;
        int ar= 0;
        while(l< r){
            if(height[l] < height[r] ){
            if(height[l] > leftMax){
                leftMax = height[l];
            }else{
                ar += leftMax - height[l];
            }
            l++;
            }
            else{
            if(height[r] >rightMax){
                rightMax = height[r];
            }else{
                ar += rightMax - height[r];
            }
            r--;
            }

        }
        // for(int i =0;i<height.length ;i++){
        //  ar += Math.min(height[l], height[r]);
        // }
        return ar;
    }
}
