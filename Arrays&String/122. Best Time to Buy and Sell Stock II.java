class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        for(int i=0;i<prices.length-1;i++){
            // if next day ka price jyada hai 
            // profit kab hoga - jab array upward jayega it means next wale ka price jyada 
            // hona chahiye 
            if(prices[i+1]>prices[i])
            maxProfit+=prices[i+1]-prices[i];
    }
    return maxProfit;
    }
}
