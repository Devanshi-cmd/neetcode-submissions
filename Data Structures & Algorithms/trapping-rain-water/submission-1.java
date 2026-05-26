class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        int left=0;
        int right=0;
        while(l<r){
            int ans=0;
            if(height[l]<height[r]){
                if(height[l]>=left){
                    left=height[l];
                }
                else{
                    max+=left-height[l];
                }
                l++;
            }
            else{
                if(height[r]>=right){
                    right=height[r];
                }
                else{
                    max+=right-height[r];
                }
                r--;
            }
        }
        return max;
    }
}
