class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int arr[][] = new int[r*c][2];
        int a=0;
        
        //find all the indices of 0
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c ; j++){
                if(matrix[i][j]==0){
                    arr[a][0]=i;
                    arr[a][1]=j;
                    a++;
                }
            }
        }
        
        //take each indices and make the entire row and col 0
        for(int i = 0 ; i < a ; i++)
        {
            int row=arr[i][0];  
            int col=arr[i][1];  
            
            for(int j=0;j<c;j++){
                matrix[row][j]=0;
            }
            
            for(int j=0;j<r;j++){
                matrix[j][col]=0;
            }            
        }
    }
}
