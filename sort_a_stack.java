import java.util.*;

public class sort_a_stack {
    public static void sortStack(Stack<Integer> stack) {
		Stack<Integer>ans=new Stack<>();
        while(!stack.isEmpty()){
            int a=stack.pop();
            if(ans.isEmpty()){
                ans.add(a);
            }
            else{
                if(ans.peek()>=a) ans.add(a);
                else{
                    Stack<Integer>temp=new Stack<>();
                    while(!ans.isEmpty() && ans.peek()<a){
                        temp.add(ans.pop());
                    }
                    ans.add(a);
                    while(!temp.isEmpty()){
                        ans.add(temp.pop());
                    }
                }
            }
        }
        while(!ans.isEmpty()){
            stack.add(ans.pop());
        }
        
	}
}
