import java.util.*;
public class Subset_Sum {
    public static ArrayList<Integer> subsetSum(int nums[]) {
        // Write your code here..
        ArrayList<Integer>l1=new ArrayList<>();
        solve(0,nums,0,l1);
        Collections.sort(l1);
        return l1;
    }
    static void solve(int i,int[] nums,int sum,ArrayList<Integer>l1){
        if(i==nums.length){
            l1.add(sum);
            return;
        }
        solve(i+1,nums,sum,l1);
        solve(i+1,nums,sum+=nums[i],l1);
    }
}
