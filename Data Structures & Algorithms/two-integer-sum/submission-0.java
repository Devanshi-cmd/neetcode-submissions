class Solution {
    public int[] twoSum(int[] nums, int target) {
        int low=0;
        int high=nums.length;
        for(int i=0;i<high;i++){
            for(int j=i+1;j<high;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}