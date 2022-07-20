import java.util.*;
public class Maximum_Consecutive_ones {
    public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		// Write your code here.
//         int[][][] dp=new int[arr.size()][k+1][arr.size()];
//         for(int[][] a:dp){
//             for(int[] b:a){
//                 Arrays.fill(b,-1);
//             }
//         }
//         return solve(arr,0,k,0,dp);
        int j=-1;
        int count_0=0;
        int ans=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==0) count_0++;
            while(count_0>k){
                j++;
                if(arr.get(j)==0) count_0--;
            }
            ans=Math.max(ans,i-j);
        }
        return ans;
	}
//     static int solve(ArrayList<Integer>arr,int i,int k,int count,int[][][] dp){
//         if(i==arr.size()) return count;
//         if(k==0 && arr.get(i)!=1) return count;
        
//         if(dp[i][k][count]!=-1) return dp[i][k][count];
//         int not_pick=solve(arr,i+1,k,0,dp);
//         int pick=0;
//         if(arr.get(i)==0 && k>0) pick=solve(arr,i+1,k-1,count+1,dp);
//         if(arr.get(i)==1) pick=solve(arr,i+1,k,count+1,dp);
//         return dp[i][k][count]=Math.max(pick,not_pick);
//     }
}

