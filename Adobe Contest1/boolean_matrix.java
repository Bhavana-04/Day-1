class Solution
{
    void booleanMatrix(int matrix[][])
    {
        // code here 
        int rows=matrix.length;
        int cols=matrix[0].length;
        int row[]=new int[rows];
        int col[]=new int[cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==1){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=1;
                }
            }
        }
    }
}