class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        int mid= 0;
        for(int i: piles){
            r= Math.max(r,i);
        }
        int result = r;
        while(l<=r){
            mid = (r+l)/2;
            long sum =0;
            for(int k :piles){
            sum += (k+mid-1)/mid;
            }
            
            if(sum <= h){
                result = Math.min(result,mid);
                r= mid-1;
            }
            else{
                l= mid+1;
            }
        }
        return result;

    }
}
