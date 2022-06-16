import java.util.*;
public class Kth_smallest_largest {
    public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
        
        Collections.sort(arr);
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(arr.get(k-1));
        ans.add(arr.get(arr.size()-k));
        return ans;
	}
}
