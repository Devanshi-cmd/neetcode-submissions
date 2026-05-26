class Solution {
    public int characterReplacement(String s, int k) {
       int maxl=0;
        for(int i=0;i<s.length();i++){
            int maxf=0;
            int[] hash=new int[26];
            for(int j=i;j<s.length();j++){
              hash[s.charAt(j)-'A']++;
              maxf=Math.max(maxf,hash[s.charAt(j)-'A']);
              int changes=(j-i+1)-maxf; //length-freq of max occur ele
              if(changes<=k){
                 maxl=Math.max(maxl,j-i+1);
              }
              else{
                break;
              }

          }
      }
      return maxl;
      
    }
}
