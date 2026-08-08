class Solution {
    public int maxProfit(int[] prices) {
        int minP = Integer.MAX_VALUE;
        int profit = 0;
        for(int i= 0 ;i < prices.length;i++){
            profit = Math.max(prices[i] - minP , profit);
            minP = Math.min(minP,prices[i]);
        }
        return profit;
    }
}
