import java.util.* ;
import java.util.ArrayList;

public class Find_Duplicate_in_Array {
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        HashSet<Integer>ans=new HashSet<>();
        for(int i:arr){
            if(ans.contains(i)) return i;
            ans.add(i);
        }
        return 0;
    }
}
