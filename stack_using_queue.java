import java.util.*;
public class stack_using_queue {
       // Define the data members.
       Queue<Integer>q1;
       Queue<Integer>q2;
       public stack_using_queue() {
           // Implement the Constructor.
           q1=new LinkedList<Integer>();
           q2=new LinkedList<Integer>();
       }
   
   
   
       /*----------------- Public Functions of Stack -----------------*/
   
   
       public int getSize() { 
           return q1.size();
           // Implement the getSize() function.
       }
   
       public boolean isEmpty() {
           return q1.size()==0;
           // Implement the isEmpty() function.
       }
   
       public void push(int element) {
           q1.add(element);
           // Implement the push(element) function.
       }
   
       public int pop() {
           if(q1.size()==0) return -1;
           while(q1.size()>1){
               q2.add(q1.poll());
           }
           int a=q1.poll();
           while(!q2.isEmpty()){
               q1.add(q2.poll());
           }
           return a;
           // Implement the pop() function.
       }
   
       public int top() {
           if(q1.size()==0) return -1;
           while(q1.size()>1){
               q2.add(q1.poll());
           }
           int a=q1.peek();
           q2.add(q1.poll());
           while(!q2.isEmpty()){
               q1.add(q2.poll());
           }
           return a;
           // Implement the top() function.
       }
}
