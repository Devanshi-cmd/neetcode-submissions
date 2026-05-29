class Solution {
    public boolean ismatched(int[] arr1,int[] arr2){
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        if(m<n){
            return false;
        }
        int[] sone=new int[26];
        for(int i=0;i<n;i++){
            sone[s1.charAt(i)-'a']++;
        }
        //the window size will be m-n

        for(int i=0;i<=m-n;i++){
           int[] stwo=new int[26];
            for(int j=0;j<n;j++){
                stwo[s2.charAt(i+j)-'a']++;
            }
            if(ismatched(sone,stwo)){
                return true;
            }
        }
        return false;
    }
}
