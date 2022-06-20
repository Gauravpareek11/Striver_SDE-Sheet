import java.util.*;
public class Next_greater_element {
    public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		Stack<Integer>s1=new Stack<>();
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s1.isEmpty() && s1.peek()<=arr[i]){
                s1.pop();
            }
            if(s1.isEmpty()) ans[i]=-1;
            else ans[i]=s1.peek();
            s1.add(arr[i]);
        }
        return ans;
	} 
}
