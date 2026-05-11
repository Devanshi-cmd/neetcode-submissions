class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> secmap=new HashMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c:t.toCharArray()){
            if(!map.containsKey(c)){
                return false;
            }
            secmap.put(c,secmap.getOrDefault(c,0)+1);
        }
        for(Character c : map.keySet()){
            if(!map.get(c).equals(secmap.get(c))){
                return false;
            }
        }
       return true;
    }
}
