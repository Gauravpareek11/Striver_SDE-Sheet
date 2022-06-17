import java.util.*;
public class Permutations {
    public static List<String> findPermutations(String s) {
        // Write your code here.
        char[] c=s.toCharArray();
        List<String>l1=new ArrayList<>();
        solve(0,c,l1);
        return l1;
    }
    static void solve(int i,char[] c,List<String>l1){
        if(i==c.length){
            l1.add(new String(c));
            return;
        }
        for(int k=i;k<c.length;k++){
            swap(i,k,c);
            solve(i+1,c,l1);
            swap(i,k,c);
        }
    }
    static void swap(int i,int j,char[] c){
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;
    }
}
