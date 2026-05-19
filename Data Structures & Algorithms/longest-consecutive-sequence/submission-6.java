class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int max=0;
        for(int ele:set){
            if(!set.contains(ele-1)){
                int curr=ele;
                int large=1;
                while(set.contains(curr+1)){
                    curr++;
                    large++;               
                }
                max=Math.max(max,large);
            }
        }
        return max;
    }
}
