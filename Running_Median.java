import java.util.PriorityQueue;
public class Running_Median {
    public static void findMedian(int arr[])  {
        
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        PriorityQueue<Integer>max=new PriorityQueue<>((a,b)->b-a);
        PriorityQueue<Integer>min=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            if(i==0){
                max.add(arr[i]);
//                 System.out.print(arr[i]);
            }
            else if(arr[i]<=max.peek()){
                max.add(arr[i]);
            }
            else min.add(arr[i]);
            if((max.size()+min.size())%2==0 && max.size()!=min.size()){
                if(max.size()>min.size()){
                    min.add(max.poll());
                }
                else max.add(min.poll());
            }
            if(max.size()==min.size()){
                System.out.print((max.peek()+min.peek())/2);
            }
            else{
                if(max.size()>min.size()) System.out.print(max.peek());
                else System.out.print(min.peek());
            }
            if(i!=arr.length-1) System.out.print(" ");
        }
    }
}
