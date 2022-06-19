import java.util.ArrayList;
public class Merge_K_Sorted_Arrays {
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> l1, int k)
	{
		// Write your code here.
        ArrayList<Integer>ans=new ArrayList<>(l1.get(0));
        for(int x=1;x<k;x++){
            ArrayList<Integer>temp=l1.get(x);
            ArrayList<Integer>l2=new ArrayList<>();
            int i=0;
            int j=0;
            while(i<ans.size() && j<temp.size()){
                if(ans.get(i)<temp.get(j)){
                    l2.add(ans.get(i));
                    i++;
                }
                else{
                    l2.add(temp.get(j));
                    j++;
                }
            }
            while(i<ans.size()){
                l2.add(ans.get(i));
                i++;
            }
            while(j<temp.size()){
                l2.add(temp.get(j));
                j++;
            }
            ans=l2;
        }
        return ans;
	}
}
