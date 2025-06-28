class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minBuyPrice=prices[0]; // i am assuming first ele is mim buy place and sell restDays
        for(int i=1;i<prices.length;i++){
            int todayPrice=prices[i];
            int curProfit=todayPrice-minBuyPrice;
            if(curProfit>maxProfit){
                maxProfit=curProfit;
            }
            if(todayPrice<minBuyPrice){
                minBuyPrice=todayPrice;
            }
        }
        return maxProfit;
    }
}
