import java.util.*;
public class Edit_Distance {

    public static int editDistance(String str1, String str2) {
        //Your code goes here
        int[][] dp=new int[str1.length()][str2.length()];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return solve(str1,str2,str1.length()-1,str2.length()-1,dp);
    }
    static int solve(String a,String b,int i,int j,int[][] dp){
        if(i<0 && j<0) return 0;
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return solve(a,b,i-1,j-1,dp);
        else{
            int x=1+solve(a,b,i-1,j,dp);
            int y=1+solve(a,b,i-1,j-1,dp);
            int z=1+solve(a,b,i,j-1,dp);
            return dp[i][j]=Math.min(x,Math.min(y,z));
        }
    }
}
