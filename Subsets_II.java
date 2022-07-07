import java.util.*;
class ListComparator<T extends Comparable<T>> implements Comparator<List<T>> {

  @Override
  public int compare(List<T> o1, List<T> o2) {
    for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
      int c = o1.get(i).compareTo(o2.get(i));
      if (c != 0) {
        return c;
      }
    }
    return Integer.compare(o1.size(), o2.size());
  }
}
public class Subsets_II {
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        // Write your code here..
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>l1=new ArrayList<>();
        Arrays.sort(arr);
        solve(0,arr,ans,l1);
        Collections.sort(ans,new ListComparator<>());
//         Collections.sort(ans);
        return ans;
    }
   static void solve(int i,int[] arr,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>l1){
        if(i==arr.length){
            ans.add(l1);
            return;
        }
       l1.add(arr[i]);
       solve(i+1,arr,ans,new ArrayList<Integer>(l1));
       l1.remove(l1.size()-1);
       while(i+1 < arr.length && arr[i]==arr[i+1])i++;  
       solve(i+1,arr,ans,l1);
    }
}
