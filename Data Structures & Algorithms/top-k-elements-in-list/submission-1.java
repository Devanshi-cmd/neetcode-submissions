class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int len=map.size();
        int[] val=new int[len];
        int j=0;
        for(int v:map.values()){
            val[j]=v;
            j++;
        }
        Arrays.sort(val);
        int[] ans=new int[k];
        int m=0;
        HashSet<Integer> used = new HashSet<>();

        for(int n=len-1; n>=0 && m<k ; n-- ){
            //get corr key
            for(int key:map.keySet()){
                if(!used.contains(key) && map.get(key)==val[n]){
                    ans[m]=key;
                    used.add(key);

                    m++;
                    if (m == k) {
                        break;
                    }
                }
            }
        }
        return ans;
        
    }
}
