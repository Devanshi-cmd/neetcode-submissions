class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded=new StringBuilder();
        for(String l: strs){
            encoded.append(l.length());
            encoded.append("*");
            encoded.append(l);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        //u have a string say ram*ghu20*2 then ans ram ghu 20*2
        List<String> decoded = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            StringBuilder len=new StringBuilder();
            while(str.charAt(i)!='*'){
                len.append(str.charAt(i));
                i++;
            }
            int l=Integer.parseInt(len.toString());
            StringBuilder st=new StringBuilder();
            int idx=i+1;
            while(idx<i+1+l){          
                st.append(str.charAt(idx));
                idx++;
            }
            decoded.add(st.toString());
            i=i+1+l;
        }
        return decoded;
    }
}
