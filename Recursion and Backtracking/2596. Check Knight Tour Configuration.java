/*
the knight can only move in 8 directions
after finding one right place we will check for the next expected value
Check that every consecutive pair forms a valid knight move.
*/

class Solution {
    public boolean checkValidGrid(int[][] grid) {
        int n=grid.length;
        return (checkKnight(grid,0,0,n,0));
    }
    public boolean checkKnight(int grid[][],int r,int c,int n,int exp)
    {
        if(r<0 || c<0 || r>=n || c>=n || exp != grid[r][c]){
            return false;
        }
        if(exp == (n*n-1)){
            return true;
        }
        
        boolean a1 = (checkKnight(grid,r-2,c+1,n,exp+1));
        boolean a2 = (checkKnight(grid,r-1,c+2,n,exp+1));
        boolean a3 = (checkKnight(grid,r+1,c+2,n,exp+1));
        boolean a4 = (checkKnight(grid,r+2,c+1,n,exp+1));
        boolean a5 = (checkKnight(grid,r+2,c-1,n,exp+1));
        boolean a6 = (checkKnight(grid,r+1,c-2,n,exp+1));
        boolean a7 = (checkKnight(grid,r-1,c-2,n,exp+1));
        boolean a8 = (checkKnight(grid,r-2,c-1,n,exp+1));

        return (a1 || a2 || a3 || a4 || a5 || a6 || a7 || a8);
    }
}
