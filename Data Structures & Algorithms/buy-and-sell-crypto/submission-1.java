class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int min=prices[0];//selecting min day to buy the stock
        for(int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i-1]); // so cal every left possible min to right
            ans=Math.max(ans,prices[i]-min);
            // u cant just use the ans one since that checks the adjacent ele onlyy

        }
        return ans;
    }
}
