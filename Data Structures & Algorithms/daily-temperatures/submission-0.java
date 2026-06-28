class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] r = new int[n];
        for(int i=0; i<n ;i++){
            int left  = i+1;
            while(left< n){
                if(temperatures[i]<temperatures[left]){
                    r[i] = left-i;
                    break;
                }
                else{
                    r[i] = 0;
                    left++;
                }
            }
        }
        return r;
    }
}
