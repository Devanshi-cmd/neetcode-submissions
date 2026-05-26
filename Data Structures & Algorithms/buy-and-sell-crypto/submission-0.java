class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(prices[j]-prices[i]>0){
                    //can sell
                    max=Math.max(max,prices[j]-prices[i]);
                }
            }
        }
        return max;
    }
}
