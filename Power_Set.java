import java.util.*;
public class Power_Set {
    public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		// WRITE YOUR CODE HERE
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int i=0;i<(1<<arr.size());i++){
            ArrayList<Integer>l1=new ArrayList<Integer>();
            for(int j=0;j<arr.size();j++){
                if((i&(1<<j))>=1) l1.add(arr.get(j));
            }
            ans.add(l1);
        }
        return ans;
	}
}
