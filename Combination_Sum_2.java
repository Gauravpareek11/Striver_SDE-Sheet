import java.util.*;

public class Combination_Sum_2 {
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        Collections.sort(arr);
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        solve(0,arr,l1,ans,0,target);
        return ans;
    }
    static void solve(int i,ArrayList<Integer> arr,ArrayList<Integer>l1,ArrayList<ArrayList<Integer>>ans,int sum,int target){
        if(i==arr.size()){
            if(sum==target && l1.size()>0){    
                ans.add(l1);
            }
            return;
        }
        l1.add(arr.get(i));
        solve(i+1,arr,new ArrayList<>(l1),ans,sum+arr.get(i),target);
        l1.remove(l1.size()-1);
        while(i+1<arr.size() && arr.get(i)==arr.get(i+1)) i++;
        solve(i+1,arr,new ArrayList<>(l1),ans,sum,target);
    }
}
