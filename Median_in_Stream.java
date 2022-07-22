import java.util.*;

public class Median_in_Stream {
    public static int[] findMedian(int[] arr, int n) {
        // Write your code here.
        PriorityQueue<Integer>min=new PriorityQueue<>();
        PriorityQueue<Integer>max=new PriorityQueue<>((a,b)->b-a);
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(i%2==0){
                min.add(arr[i]);
                max.add(min.peek());
                min.poll();
                ans[i]=max.peek();
            }
            else{
                max.add(arr[i]);
                min.add(max.peek());
                max.poll();
                ans[i]=(max.peek()+min.peek())/2;
            }
        }
        return ans;
    }
}
