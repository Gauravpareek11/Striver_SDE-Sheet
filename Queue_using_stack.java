import java.util.*;
public class Queue_using_stack {
     // Define the data members(if any) here.
     Stack<Integer>s1;
     Stack<Integer>s2;
     Queue_using_stack() {
         s1=new Stack<>();
         s2=new Stack<>();
         // Initialize your data structure here.
     }
 
     void enQueue(int val) {
         s1.add(val);
         // Implement the enqueue() function.
     }
 
     int deQueue() {
         if(s1.size()==0) return -1;
         while(s1.size()>1){
             s2.add(s1.pop());
         }
         int a=s1.pop();
         while(!s2.isEmpty()){
             s1.add(s2.pop());
         }
         return a;
         // Implement the dequeue() function.
     }
 
     int peek() {
         if(s1.size()==0) return -1;
         while(s1.size()>0){
             s2.add(s1.pop());
         }
         int a=s2.peek();
         while(!s2.isEmpty()){
             s1.add(s2.pop());
         }
         return a;
         // Implement the peek() function here.
     }
 
     boolean isEmpty() {
         return s1.size()==0;
         // Implement the isEmpty() function here.
     }
}
