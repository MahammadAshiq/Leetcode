class Solution {
    public int maxProfit(int[] prices) {
        int min_price=9999;
        int max_profit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<min_price)
            {
                min_price=prices[i];
            }
            if(max_profit<Math.abs(min_price-prices[i]))
            {
                max_profit=Math.abs(min_price-prices[i]);
            }
        }
        return max_profit;
    }
}