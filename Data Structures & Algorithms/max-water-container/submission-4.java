class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int max=-1;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ans=(j-i)*Math.min(heights[j],heights[i]);
                 max=Math.max(ans,max);
            }
           
        }
        return max;
    }
}
