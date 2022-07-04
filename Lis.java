import java.util.*;
public class Lis {
    public static int longestIncreasingSubsequence(int nums[]) {
		//Your code goes here
//         int[][] dp=new int[arr.length][arr.length+1];
//         for(int[] a:dp){
//             Arrays.fill(a,-1);
//         }
//          return lis(arr,0,-1,dp);
        ArrayList<Integer>l1=new ArrayList<Integer>();
        l1.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>l1.get(l1.size()-1)) l1.add(nums[i]);
            else{
                int ind=search(l1,0,l1.size()-1,nums[i]);
                l1.set(ind,nums[i]);
            }
        }
        return l1.size();
    }
        
    static int search(ArrayList<Integer>l1,int low,int high,int x){
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(l1.get(mid)==x) return mid;
            else if(l1.get(mid)>x){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
	}
//     static int lis(int[] arr,int i,int prev,int[][] dp){
//         if(i==arr.length) return 0;
        
//         if(dp[i][prev+1]!=-1) return dp[i][prev+1];
//         int not_pick=lis(arr,i+1,prev,dp);
//         int pick=0;
//         if(prev==-1 || arr[prev]<arr[i]) pick=1+lis(arr,i+1,i,dp);
//         return dp[i][prev+1]=Math.max(not_pick,pick);
//     }
}
