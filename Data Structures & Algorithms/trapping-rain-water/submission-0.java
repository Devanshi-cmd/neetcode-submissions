class Solution {
    public int findleftmax(int idx,int[] height){
        int max=-1;
        for(int i=0;i<idx;i++){
           max=Math.max(max,height[i]); 
        }
        return max;
    }
    public int findrightmax(int idx,int[] height){
        int max=-1;
        for(int i=idx+1;i<height.length;i++){
            max=Math.max(max,height[i]);
        }
        return max;
    }
    public int trap(int[] height) {
        int maxwater=0;
        for(int i=0;i<height.length;i++){
            int leftmax=findleftmax(i,height);
            int rightmax=findrightmax(i,height);
            int ans=Math.min(leftmax,rightmax)-height[i];
            if(ans>0){
                maxwater+=ans;
            }
        }
        return maxwater;
    }
}
