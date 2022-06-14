public class Trapping_Rain_Water {
    public static long getTrappedWater(long[] arr, int n) {
        long[] left=new long[n];
        long[] right=new long[n];
        long max=0;
        for(int i=0;i<n;i++){
            left[i]=Math.max(max,arr[i]);
            max=left[i];
        }
        max=0;
        for(int i=n-1;i>=0;i--){
            right[i]=Math.max(max,arr[i]);
            max=right[i];
        }
        long ans=0;
//         System.out.println(Arrays.toString(left));
//         System.out.println(Arrays.toString(right));
        for(int i=0;i<n;i++){
            
            ans+=(Math.min(left[i],right[i])-arr[i]);
        }
        return ans;
    }
}
