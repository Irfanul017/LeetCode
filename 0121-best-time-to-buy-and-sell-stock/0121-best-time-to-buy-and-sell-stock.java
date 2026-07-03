class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mini = prices[0];
        int maxprofit = 0;

        for(int i=1 ; i < n; i++){ 
            // Calculate profit if we sell on day i
            int cost = prices[i] - mini;
            maxprofit= Math.max(maxprofit , cost);
            
             // Update mini to track the lowest buying price seen so far
            mini = Math.min(mini , prices[i]);

        }
        return maxprofit;
        
    }
}