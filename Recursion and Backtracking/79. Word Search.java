class Solution {
    public boolean dfs(char[][] board, String word,int i,int j,int strIdx){
        if(strIdx == word.length()){
            return true;
        }
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(strIdx)){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#';   //marking as visited
        boolean result= dfs(board,word,i+1,j,strIdx+1) || 
                        dfs(board,word,i-1,j,strIdx+1) ||
                        dfs(board,word,i,j+1,strIdx+1) || 
                        dfs(board,word,i,j-1,strIdx+1);
        board[i][j]=temp;   //backtracking
        return result;
    }
    public boolean exist(char[][] board, String word) {
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(board[i][j] == word.charAt(0) && dfs(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;        
    }
}
