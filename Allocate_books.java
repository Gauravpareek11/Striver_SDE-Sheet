public class Allocate_books {
    public static long ayushGivesNinjatest(int n, int m, int[] time) {
        // Write your code here.
        long sum=0;
        long low=1;
        for(int i:time){
            low=Math.max(i,low);
            sum+=i;
        }
        long high=sum;
        long ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(solve(time,mid)<=n){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    static int solve(int[] time,long mid){
        int c =1;
        long sum=0;
        for(int i=0;i<time.length;i++){
            sum+=time[i];
            if(sum>mid){
                c++;
                sum=time[i];
            }
        }
        return c;
    }
}
