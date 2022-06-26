import java.util.*;
public class Kth_largest_element_in_stream {
    PriorityQueue<Integer>pq;
    Kth_largest_element_in_stream(int k, int[] arr) {
        pq=new PriorityQueue<Integer>(k);
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        // Write your code here.
    }

    void add(int num) {
        // Write your code here.
        if(pq.peek()<num){
            pq.poll();
            pq.add(num);
        }
    }

    int getKthLargest() {
        return pq.peek();
        // Write your code here.
    }
}
