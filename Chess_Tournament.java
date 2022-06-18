import java.util.*;
public class Chess_Tournament {
    public static int chessTournament(int[] positions, int n,  int c) 
	{
        // Write your code here.  
        int low=0;
        int high=Integer.MIN_VALUE;
        for(int i:positions){
            high=Math.max(i,high);
        }
        Arrays.sort(positions);
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(solve(positions,mid)>=c){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
    static int solve(int[] positions,int mid){
        int c=1;
        int prev=positions[0];
        for(int j:positions){
            if(Math.abs(j-prev)>=mid){
                c++;
                prev=j;
            }
        }
        return c;
    }
}
