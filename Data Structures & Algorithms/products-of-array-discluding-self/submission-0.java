class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int product=1;
        for(int i=0;i<nums.length;i++){
            product=1;
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    product*=nums[j];
                }
                ans[i]=product;
            }
           
        }
        return ans;
    }
}  
