class Solution {
    public int climbStairs(int n) {
        int curr = 2;
        int prev = 1;
        if(n<=2){
            return n;
        }
        for(int i = 3;i <=n; i++){
            int temp = curr + prev;  //3 
            prev = curr;             //2
            curr = temp;           //3
        }
        return curr;
        
    }
}
