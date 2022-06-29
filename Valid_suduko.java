public class Valid_suduko {
    public static boolean isItSudoku(int matrix[][]) {

		// Write your code here.
        return solve(matrix);

	}
    static boolean solve(int matrix[][]){
        int row=-1;
        int col=-1;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(matrix[i][j]==0){
                    row=i;
                    col=j;
                }
            }
        }
        if(row==-1 && col==-1) return true;
        for(int i=1;i<=9;i++){
            if(isValid(row,col,matrix,i)){
                matrix[row][col]=i;
                if(solve(matrix)) return true;
            }
            matrix[row][col]=0;
        }
        return false;
    }
   static boolean isValid(int row,int col,int[][] matrix,int num){
        for(int i=0;i<9;i++){
            if(matrix[row][i]==num) return false;
        }
        for(int i=0;i<9;i++){
            if(matrix[i][col]==num) return false;
        }
        int rowstart=row-row%3;
        int colstart=col-col%3;
        for(int i=rowstart;i<rowstart+3;i++){
            for(int j=colstart;j<colstart+3;j++){
                if(matrix[i][j]==num) return false;
            }
        }
        return true;
    }
}
