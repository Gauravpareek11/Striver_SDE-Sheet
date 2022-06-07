import java.util.*;
public class Missing_and_Repeating_Numbers {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        HashSet<Integer>s1=new HashSet<>();
        int r=0;
        for(int i:arr){
            if(s1.contains(i)) r=i;
            s1.add(i);
        }
        int m=0;
        for(int i=1;i<=n;i++){
            if(!s1.contains(i)) m=i;
        }
        return new int[]{m,r};
    }
}
