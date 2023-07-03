class Solution {
  /**In this problem we have to flag the columns and which are going to change into zeros
  So we are making first cell of that row and column as flags by making both of them into zeros
  and for the the cells which have already zeros in the first cells in only a row or in only column are flaged by rowFlag and colFlag Variables */
    public void setZeroes(int[][] matrix) {
        boolean rowFlag = false,colFlag = false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    if(i == 0) 
                        rowFlag = true;
                    if(j == 0) 
                        colFlag = true;
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(rowFlag) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if(colFlag) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
