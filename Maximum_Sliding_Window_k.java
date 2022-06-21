
import java.util.*;
public class Maximum_Sliding_Window_k {
    
	public static ArrayList<Integer> getMaximumOfSubarrays(ArrayList<Integer> nums, int k) 
	{
		//	  Write your code here.
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int i=0;i<k;i++){
            pq.add(nums.get(i));
        }
        int j=k;
        int i=0;
        ArrayList<Integer>ans=new ArrayList<>();
        while(j<nums.size()){
            ans.add(pq.peek());
            pq.remove(nums.get(i));
            pq.add(nums.get(j));
            j++;
            i++;
        }
        ans.add(pq.peek());
        return ans;
	}
}
