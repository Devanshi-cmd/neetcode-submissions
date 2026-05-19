class Solution {

    public boolean check(int[] arr){

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<9;i++){

            if(arr[i]==-1){
                continue;
            }

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

            if(map.get(arr[i])>1){
                return false;
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        int[][] newb=new int[9][9];

        // conversion
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

        // rows
        for(int i=0;i<9;i++){

            if(!check(newb[i])){
                return false;
            }
        }

        // columns
        for(int j=0;j<9;j++){

            int[] temp=new int[9];

            for(int row=0;row<9;row++){

                temp[row]=newb[row][j];
            }

            if(!check(temp)){
                return false;
            }
        }

        // 3x3 boxes
        for(int row=0;row<9;row+=3){

            for(int col=0;col<9;col+=3){

                int[] temp=new int[9];
                int idx=0;

                for(int i=row;i<row+3;i++){

                    for(int j=col;j<col+3;j++){

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