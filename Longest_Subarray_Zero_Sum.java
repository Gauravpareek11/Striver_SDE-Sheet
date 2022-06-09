import java.util.*;

public class Longest_Subarray_Zero_Sum {
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
        HashMap<Integer,Integer>m1=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int[] sum=new int[arr.size()];
        int s=0;
        for(int i=0;i<arr.size();i++){
            s+=arr.get(i);
            if(s==0) max=Math.max(max,i+1);
            sum[i]=s;
            m1.put(s,i);
        }
        for(int i=0;i<sum.length;i++){
            if(m1.containsKey(sum[i])){
                max=Math.max(max,m1.get(sum[i])-i);
            }
        }
        return max;
    }
}
