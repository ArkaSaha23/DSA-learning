class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char board[][]= new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.'); //fill the board with '.'
        }
        getQueen(result,board,0,n);
        return result;        
    }
    public void getQueen(List<List<String>> result,char board[][],int row,int n){
        if(row==n)
        {
            List<String> sublist = new ArrayList<>();  //as the result takes List we have to convert the board to String
            for (int i = 0; i < n; i++) {
               sublist.add(new String(board[i]));//converting the board to List row wise and adding them is sublist
            }
            result.add(sublist);  //adding the sublist to result List
            return;
        }

        for(int column=0;column<n;column++)
        {
            //check if that particular row and column is safe
            if(isSafe(board,row,column,n))
            {
                board[row][column]='Q';
                getQueen(result,board,row+1,n);
                board[row][column]='.';  //backtracking step
            }
        }
    }
    //should be hirizontally safe,vertically safe ,diagonally safe
    public boolean isSafe(char board[][],int row,int column,int n){
        //horizontal
        for(int i=0;i<n;i++){
            if(board[row][i]=='Q') return false;
        }
        //vertically
        for(int i=0;i<n;i++){
            if(board[i][column]=='Q') return false;
        }
        //diogonally upper-left 
        for(int i=row,j=column;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        //diogonally upper-right
        for(int i=row,j=column;i>=0 && j<n;i--,j++){  
            if(board[i][j]=='Q') return false;
        }  
        return true;
    }
}
