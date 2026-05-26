class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int c=0;
        int max=0;
        while(i<s.length()){
            int j=i;
            c=0;
            HashSet<Character> set=new HashSet<>();
            while(j<s.length() && !set.contains(arr[j])){
                c++;
                set.add(arr[j]);
                j++;
            }
            i++;
            max=Math.max(max,c);
        }
        return max;
    }
}
