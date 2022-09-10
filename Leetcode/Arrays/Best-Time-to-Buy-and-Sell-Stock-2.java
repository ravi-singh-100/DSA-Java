// Ques:  https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii

class Solution {
    public int maxProfit(int[] prices) {
        int buy1=Integer.MAX_VALUE;
        int profit1=0;
        int buy2=Integer.MAX_VALUE;
        int profit2=0;
        for(int i=0;i<prices.length;++i){
            if(buy1>prices[i]){
                buy1=prices[i];
            }
            else if(prices[i]-buy1>0){
                profit1+=prices[i]-buy1;
                buy1=Integer.MAX_VALUE;
            }
            if(buy1>prices[i]){
                buy1=prices[i];
            }
             else if(prices[i]-buy1>profit2){
                profit2+=prices[i]-buy2;
            }
        }
        return Math.max(profit1,profit2);
    }
}
