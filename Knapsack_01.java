import java.util.ArrayList;
public class Knapsack_01 {
    public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
		// Write your code here.
        int[][] dp=new int[values.size()][w+1];
        for(int i=weights.get(0);i<=w;i++){
            dp[0][i]=values.get(0);
        }
        for(int i=1;i<values.size();i++){
            for(int j=w;j>=0;j--){
                int not_pick=dp[i-1][j];
                int pick=0;
                if(weights.get(i)<=j) pick=dp[i-1][j-weights.get(i)]+values.get(i);
                dp[i][j]=Math.max(pick,not_pick);
            }
        }
        return dp[values.size()-1][w];
	}
}
