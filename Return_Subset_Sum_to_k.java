import java.util.*;
public class Return_Subset_Sum_to_k {
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        // Write your code here.
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>l1=new ArrayList<>();
        solve(arr,0,l1,0,ans,k);
        return ans;
    }
    static void solve(ArrayList<Integer>arr,int i,ArrayList<Integer>l1,int sum,ArrayList<ArrayList<Integer>>ans,int k){
        if(i==arr.size()){
            if(sum==k && l1.size()>0){
//                 Collections.sort(l1);
                ans.add(l1);
            }
            return;
        }
        solve(arr,i+1,new ArrayList<>(l1),sum,ans,k);
        l1.add(arr.get(i));
        solve(arr,i+1,new ArrayList<>(l1),sum+arr.get(i),ans,k);
    }
}
