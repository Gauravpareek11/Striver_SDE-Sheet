
public class Maximum_Subarray_Sum {
    public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
        long max=0;
        for(int i:arr){
            max=Math.max(max,i);
        }
        long cursum=0;
        long maxsum=max;
        for(int i:arr){
            cursum+=i;
            if(cursum<0){
                cursum=0;
            }
            if(cursum>maxsum){
                maxsum=cursum;
            }
        }
        return maxsum;
	}
}
