

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    LinkedListNode(T data)
    {
        this.data = data;
        this.next = null;
    }
}

public class Delete_Node_in_LL {
    public static void deleteNode(LinkedListNode<Integer> node) {
		// Write your code here.
        LinkedListNode<Integer>ptr=node;
        LinkedListNode<Integer>next=null;
        while(ptr.next!=null){
            next=ptr;
            ptr.data=ptr.next.data;
            ptr=ptr.next;
        }
        next.next=null;
	}
}
