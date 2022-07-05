public class Find_number_of_islands {
    public static int getTotalIslands(int[][] mat) 
	{
        //Your code goes here
        int ans=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    ans++;
                    solve(mat,i,j);
                }
            }
        }
         return ans;
    }
    static void solve(int[][] mat,int i,int j){
        if(i<0 || i>=mat.length || j<0 || j>=mat[0].length || mat[i][j]==0){
            return;
        }
        mat[i][j]=0;
        solve(mat,i+1,j);
        solve(mat,i-1,j);
        
        solve(mat,i,j-1);
        solve(mat,i,j+1);
        
        solve(mat,i+1,j+1);
        solve(mat,i+1,j-1);
        
        solve(mat,i-1,j+1);
        solve(mat,i-1,j-1);
    }
}
