public class Nth_root_m {
    public static double findNthRootOfM(int n, long m) {
    	// Write your code here.
//        double e=1e-7;
//         double low=1.0;
//         double high=(double)m;
//         while(Math.abs(high-low)>e){
//             double mid=(high+low)/2.0;
//             if(multiply(n,mid)>(double)m) high=mid;
//             else low=mid;
//         }
//         return low;
        double t=1.000000/n;
        double ans=Math.pow(m,t);
        return ans;
    }
//    static double multiply(int n,double mid){
//         double ans=1.00;
//         for(int i=0;i<n;i++){
//             ans*=mid;
//         }
//         return ans;
//     }
}
