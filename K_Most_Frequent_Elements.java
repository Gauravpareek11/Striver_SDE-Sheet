import java.util.*;
public class K_Most_Frequent_Elements {
    public static int[] KMostFrequent(int n, int k, int[] arr) {
		// Write your code here.
        HashMap<Integer,Integer>m1=new HashMap<>();
        for(int i:arr){
            if(m1.containsKey(i)){
                m1.put(i,m1.get(i)+1);
            }
            else m1.put(i,1);
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((x,y)->Integer.compare(m1.get(y),m1.get(x)));
        for(int i:m1.keySet()){
            pq.add(i);
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }
        return ans;
	}
}
