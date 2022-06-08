public class Modular_Exponentiation {
    public static int modularExponentiation(int x, int n, int m) {
        // Write your code here.        
        long ans=1;
        long x1=(long)x;
        while(n!=0){
            if((n&1)==1){
                ans=((ans%m)*(x1%m))%m;
            }
            x1=((x1%m)*(x1%m))%m;
            n=n>>1;
        }
        return (int)ans;
    }
}
