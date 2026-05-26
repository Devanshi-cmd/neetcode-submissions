class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int j=target-a;
            if(map.containsKey(j)){
                return new int[]{map.get(j),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
        
    }
}
