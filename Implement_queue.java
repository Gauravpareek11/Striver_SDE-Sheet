import java.util.*;
public class Implement_queue {
    ArrayList<Integer>l1;
    int i;
    int j;
    Implement_queue() {
        l1=new ArrayList<>();
        i=-1;
        j=-1;
        // Implement the Constructor
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        return (l1.size()==0);
        // Implement the isEmpty() function
    }

    void enqueue(int data) {
        l1.add(data);
        // Implement the enqueue() function
    }

    int dequeue() {
        if(l1.size()==0) return -1;
        int a=l1.get(0);
        l1.remove(0);
        return a;
        // Implement the dequeue() function
    }

    int front() {
        if(l1.size()==0) return -1;
        return l1.get(0);
        // Implement the front() function
    }
}
