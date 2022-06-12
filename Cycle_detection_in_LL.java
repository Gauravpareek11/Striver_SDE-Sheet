

    // Following is the representation of the Singly Linked List node

class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class Cycle_detection_in_LL {
    public static boolean detectCycle(Node<Integer> head) {
        //Your code goes here
        Node<Integer>slow=head;
        Node<Integer>fast=slow.next;
        while(fast!=null && fast.next!=null){
            if(slow==fast) return true;
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}
