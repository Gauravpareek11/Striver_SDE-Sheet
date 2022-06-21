import java.util.*;

public class Min_Heap {
    static int[] minHeap(int n, int[][] q) {
        // Write your code here.
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
//         int i=0;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int[] a:q){
            if(a[0]==0) pq.add(a[1]);
            else ans.add(pq.poll());
        }
        int[] a1=new int[ans.size()];
        for(int i=0;i<a1.length;i++){
            a1[i]=ans.get(i);
        }
        return a1;
    }
}
