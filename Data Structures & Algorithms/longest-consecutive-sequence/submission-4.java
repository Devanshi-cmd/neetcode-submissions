class Solution {
    public int longestConsecutive(int[] nums) {
        int max=1;
        if(nums.length<=1){
            return nums.length;
        }
        int large=1;
        Arrays.sort(nums);
        int ans=nums[0];
     
        for(int i=1;i<nums.length;i++){  
            if(nums[i]==nums[i-1]){
                continue;
            }        
            if(nums[i]==ans+1){
                large++;           
            }
            else{
                max=Math.max(max,large);
                large=1;
            }
            max=Math.max(max,large);
            ans=nums[i];
        }
        return max;
    }
}
