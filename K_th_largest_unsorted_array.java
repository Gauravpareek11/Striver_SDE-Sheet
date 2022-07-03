import java.util.*;
public class K_th_largest_unsorted_array {
    static int kthLargest(ArrayList<Integer> arr, int size, int K) {
		// Write your code here.
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<K;i++){
            pq.add(arr.get(i));
        }
//         int i=k;
        for(int i=K;i<arr.size();i++){
            if(pq.peek()<arr.get(i)){
                pq.poll();
                pq.add(arr.get(i));
            }
        }
//         while(pq.size()>1){
//             pq.poll();
//         }
        return pq.peek();
	}

}
