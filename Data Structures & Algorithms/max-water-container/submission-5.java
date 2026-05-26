class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int ans=0;
        int max=-1;
        while(l<r){
            ans=(r-l)*Math.min(heights[l],heights[r]);
            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
            max=Math.max(ans,max);
           
        }
        return max;
    }
}
