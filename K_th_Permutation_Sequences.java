import java.util.*;

public class K_th_Permutation_Sequences {
    public static String kthPermutation(int n, int k) {
        // Write your code here.
//         List<String>l1=new ArrayList<>();
//         char[] c=new char[n];
//         for(int i=0;i<n;i++){
//             c[i]=(char)('0'+i+1);
//         }
//         solve(0,c,l1,k);
//         Collections.sort(l1);
// //         System.out.println(l1);
//         return l1.get(k-1);
        ArrayList<Integer>l1=new ArrayList<>();
        int fact=1;
        for(int i=1;i<n;i++){
            fact*=i;
            l1.add(i);
        }
        l1.add(n);
        k--;
        String ans="";
        while(true){
            ans=ans+(char)(l1.get(k/fact)+'0');
            l1.remove(l1.get(k/fact));
            if(l1.size()==0) break;
            k=k%fact;
            fact=fact/l1.size();
        }
        return ans;
    }
//     static void solve(int i,char[] a,List<String>l1,int x){
//         if(i==a.length){
//             l1.add(new String(a));
//             return;
//         }
//         for(int k=i;k<a.length;k++){
//             swap(i,k,a);
//             solve(i+1,a,l1,x);
//             swap(i,k,a);
//         }
//     }
//     static void swap(int i,int j,char[] a){
//         char temp=a[i];
//         a[i]=a[j];
//         a[j]=temp;
//     }
}
