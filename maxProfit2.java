class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] > prices[i-1] ){
                profit+= prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int i=0,profit=0,buy,sell,n=prices.length-1;
        while(i<n){
            while(i<n && prices[i+1] <= prices[i]) 
                i++;
            buy=prices[i];
            while(i<n && prices[i+1] > prices[i])
                i++;
            sell=prices[i];
            profit += sell - buy;
        }
        return profit;
    }
}
