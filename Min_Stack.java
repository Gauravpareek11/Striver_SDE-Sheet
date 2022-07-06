import java.util.*;
public class Min_Stack {
    static class MinStack {

        // Constructor
        Stack<Integer>s1;
        TreeMap<Integer,Integer>m1;
        MinStack() {
            s1=new Stack<>();
           m1=new TreeMap<>();
        }

        // Function to add another element equal to num at the top of stack.
        void push(int num) {
            // Write your code here.
            s1.add(num);
            m1.put(num,m1.getOrDefault(num,0)+1);
        }

        // Function to remove the top element of the stack.
        int pop(){
            if(s1.size()>0) {
                m1.put(s1.peek(),m1.get(s1.peek())-1);
                if(m1.get(s1.peek())==0) m1.remove(s1.peek());
            }
            return s1.isEmpty()?-1:s1.pop();
            // Write your code here.
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
             return s1.isEmpty()?-1:s1.peek();
            // Write your code here.
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            return s1.size()==0?-1:m1.firstKey();
            // Write your code here.
        }
    }
}
