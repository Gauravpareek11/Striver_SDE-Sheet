import java.util.*;
public class Next_Smaller_Element {
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        Stack<Integer>s1=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            while(!s1.isEmpty() && s1.peek()>=arr.get(i)){
                s1.pop();
            }
            if(s1.isEmpty()) ans.add(-1);
            else ans.add(s1.peek());
            s1.add(arr.get(i));
        }
        Collections.reverse(ans);
        return ans;
    }
}
