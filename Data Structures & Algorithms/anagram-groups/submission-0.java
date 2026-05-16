class Solution {
    public boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> secmap=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c: t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            secmap.put(c,secmap.getOrDefault(c,0)+1);
        }
        
        for(Character c:map.keySet()){
            if(!map.get(c).equals(secmap.get(c))){
                return false;
            }
        }
        return true;
        
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        boolean[] visited=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(visited[i]){
                continue;
            }
            List<String> temp=new ArrayList<>();
            temp.add(strs[i]);
            visited[i]=true;
            for(int j=i+1;j<strs.length;j++){
                if(! visited[j] && isAnagram(strs[i],strs[j])){
                        temp.add(strs[j]);
                        visited[j] = true;

                }
            }
            ans.add(temp);
        }
        return ans;
    }
}
