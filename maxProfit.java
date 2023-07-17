class Solution {
  /** You are given an array prices where prices[i] is the price of a given stock on the ith day.

      You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

      Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

      so we have to find lowest price and the highest price day after the lowest price day.   */
  
    public int maxProfit(int[] prices) {
        int leastPrice=Integer.MAX_VALUE;
        int todayProfit=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<leastPrice){
                leastPrice=prices[i];
            }
            todayProfit=prices[i]-leastPrice;
            if(profit<todayProfit){
                profit=todayProfit;
            }
        }
        return profit;
    }
}
