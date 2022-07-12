public class Minimum_Path_Sum{
    public static int minSumPath(int[][] grid) {
    	// Write your code here.
        int[][] dp=new int[grid.length][grid[0].length];
//         for(int[] a:dp){
//             Arrays.fill(a,-1);
//         }
//         return solve(grid.length-1,grid[0].length-1,grid,dp);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0 && j==0){
                     dp[0][0]=grid[0][0];
                }
                else {
                    int a=(int)1e9;
                    int b=(int)1e9;
                    if(i>0)  a=grid[i][j]+dp[i-1][j];
                    if(j>0)  b=grid[i][j]+dp[i][j-1];
                    dp[i][j]=Math.min(a,b);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
//     static int solve(int i,int j,int[][] grid,int[][] dp){
//         if(i==0 && j==0) return grid[i][j];
//         if(i<0 || j<0) return (int)1e9;
        
//         int a=grid[i][j]+solve(i-1,j,grid,dp);
//         int b=grid[i][j]+solve(i,j-1,grid,dp);
//         return dp[i][j]=Math.min(a,b);
//     }
}