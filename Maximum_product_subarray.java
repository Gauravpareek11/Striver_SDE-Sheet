import java.util.*;
public class Maximum_product_subarray {
    public static int maxIncreasingDumbbellsSum(ArrayList<Integer> rack, int n) {
        // Write your code here.
        int[][] dp=new int[rack.size()+1][rack.size()+1];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return solve(rack,0,-1,dp);
    }
    static int solve(ArrayList<Integer>rack,int i,int prev,int[][] dp){
        
        if(i>=rack.size()) return 0;
        
        if(dp[i][prev+1]!=-1) return dp[i][prev+1];
            
        int not_pick=solve(rack,i+1,prev,dp);
        int pick=0;
        if(prev==-1 || rack.get(i)>rack.get(prev)) pick=rack.get(i)+solve(rack,i+1,i,dp);
        return dp[i][prev+1]=Math.max(pick,not_pick);
    }
}
