import java.util.* ;
public class Unique_paths {
    public static int uniquePaths(int m, int n) {
		// Write your code here.
        int[][] dp=new int[m][n];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return solve(m-1,n-1,dp);
	}
    static int solve(int i,int j,int[][] dp){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int up=solve(i-1,j,dp);
        int down=solve(i,j-1,dp);
        return dp[i][j]=up+down;
    }
}
