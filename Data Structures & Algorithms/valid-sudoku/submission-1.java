class Solution {
    public boolean check(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<9;i++){
            if(arr[i]==-1){
                continue;
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int val:map.values()){
            if(val>1){
                return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        int[][] newb=new int[9][9];
        for(int r=0;r<9;r++){
            for(int j=0;j<9;j++){
                if(board[r][j]=='.'){
                    newb[r][j]=-1;
                }
                else{
                    newb[r][j]=board[r][j]-'0';
                }
            }
        }

        for(int i=0;i<9;i++){
            if(!check(newb[i])){
                return false;
            }
        }

        for(int j=0;j<9;j++){

            int[] temp=new int[9];
            for(int col=0;col<9;col++){
                temp[col]=newb[col][j];
            }

            if(!check(temp)){
                return false;
            }
        }

       
        for(int k=0;k<9;k+=3){
            for(int l=0;l<9;l+=3){
                int[] temp=new int[9];
                int idx=0;

                for(int i=k;i<k+3;i++){
                    for(int j=l;j<l+3;j++){
                        temp[idx++]=newb[i][j];
                    }
                }
                if(!check(temp)){
                    return false;
                }
                
            }
        }
        return true;
        
    }
}
