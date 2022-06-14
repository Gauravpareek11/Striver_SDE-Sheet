import java.util.*;
public class Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		// Write your code here.
        int c=0;
        for(int i=0;i<n;i++){
            c++;
            while(i+1<n && arr.get(i)==arr.get(i+1)) i++;
        }
        return c;
	}
}
