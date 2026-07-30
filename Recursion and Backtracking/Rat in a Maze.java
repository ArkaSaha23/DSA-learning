class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> result = new ArrayList<>();
        String s="";
        int n=maze.length;
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0){ //if the first cell(0,0) or (n-1,n-1) is 0 , then return empty
            return result;
        }
        boolean visited[][]=new boolean[n][n]; //mark visited array
        findPath(maze,s,visited,0,0,n,result);
        return result;
    }
    public void findPath(int[][] maze,String s,boolean visited[][],int r,int c,int n,ArrayList<String> result)
    {
        if(r<0 || c<0 || r>=n || c>=n || maze[r][c]==0 || visited[r][c])
        {
            return ;
        }
        
        if(r==n-1 && c==n-1){
            result.add(s);
            return;
        }
        visited[r][c]=true;
        //downword
        s=s+"D";
        findPath(maze,s,visited,r+1,c,n,result);
        s=s.substring(0,s.length()-1);
        
        //left
        s=s+"L";
        findPath(maze,s,visited,r,c-1,n,result);
        s=s.substring(0,s.length()-1);
        
        //right
        s=s+"R";
        findPath(maze,s,visited,r,c+1,n,result);
        s=s.substring(0,s.length()-1);
        
        //upword
        s=s+"U";
        findPath(maze,s,visited,r-1,c,n,result);
        s=s.substring(0,s.length()-1);
        
        visited[r][c]=false; //backtrack
        
    }
}
        // code here
        
        
