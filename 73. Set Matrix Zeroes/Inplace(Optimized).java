/*
1. take 1 pointer 'firstRow' to mark if there is any 0s in the first row
   take 1 pointer 'firstcolumn' to mark if there is any 0s in the first column
2. Mark the rows and columns.
   Traverse the matrix starting from (1,1) (i.e., ignore the first row and first column).
   if any inner element is 0, then its corresponding [i][0] and [0][j] will be 0.
   Whenever matrix[i][j] == 0, mark :
      - matrix[i][0] = 0 (mark the row)
      - matrix[0][j] = 0 (mark the column)
3. Set the marked columns to zero.
   Traverse the first row from j = 1 to (column - 1).
   If matrix[0][j] == 0, set every element in the jth column (except the first row) to 0.
4  Set the marked rows to zero.
   Traverse the first column from i = 1 to (row - 1).
    If (matrix[i][0] == 00, set every element in the ith row (except the first column) to 0.
5. If firstColumn == 0, set the entire first column to 0.
   If firstRow == 0, set the entire first row to 0.
Time Complexity
O(m × n)
Space Complexity
O(1) (In-place)
*/

class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int firstRow=-1,firstColumn=-1;
        for(int i=0;i<r;i++){     //checking and marking 0 if the first row has 0s
            if(matrix[i][0]==0){ 
                firstColumn=0; 
            }
        }
        for(int j=0;j<c;j++){     //checking and marking 0 if the first column has 0s
            if(matrix[0][j]==0){  
                firstRow=0;  
            }
        }
        //start iterating with the i = (1 -> row-1) and (j = 1 -> column-1),
        //if any inner element is 0, then its corresponding [i][0] and [0][j] will be 0
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
       //traverse through the first row from j = (1 to end) and check if there are any 0s.
      //if it is then that entire column will be 0
        for(int j=1;j<c;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<r;i++){
                    matrix[i][j]=0;
                }
            }
        }
        //traverse through the first column from i = (1 to end) and check if there are any 0s.
      //if it is then that entire row will be 0
        for(int i=1;i<r;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<c;j++){
                    matrix[i][j]=0;
                }
            }
        }
       //now use the two pointers firstRow and firstColumn to check if they are 0 or not
      //if firstcolumn = 0 the the entire first column is 0
      //if firstrow = 0 then the entire first row is 0
        if(firstColumn==0){
            for(int i=0;i<r;i++){
                matrix[i][0]=0;
            }
        }
        if(firstRow==0){
            for(int j=0;j<c;j++){
                matrix[0][j]=0;
            }
        }
    }
}
