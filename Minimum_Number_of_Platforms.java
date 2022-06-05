import java.util.*;
public class Minimum_Number_of_Platforms {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        Arrays.sort(at);
        Arrays.sort(dt);
        int count=0;
        int i=0;
        int j=0;
        int max=1;
        while(i<n && j<n){
            if(at[i]<=dt[j]){
                count++;
                i++;
            }
            else {count--;j++;}
            max=Math.max(max,count);
        }
        return max;
    }
}
