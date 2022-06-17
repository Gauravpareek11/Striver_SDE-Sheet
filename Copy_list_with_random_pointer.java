class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;
    LinkedListNode<T> random;

    public LinkedListNode(T data) {
        this.data = data;
    }
}
public class Copy_list_with_random_pointer {
    public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
		// Write your code here.
        if(head==null) return null;
        LinkedListNode<Integer>ptr=head;
        LinkedListNode<Integer>next=null;
        while(ptr!=null){
            next=ptr.next;
            ptr.next=new LinkedListNode<Integer>(ptr.data);
            ptr.next.next=next;
            ptr=next;
        }
        ptr=head;
        while(ptr!=null){
            if(ptr.random==null)ptr.next.random=null;
            else ptr.next.random=ptr.random.next;
            ptr=ptr.next.next;
        }
        LinkedListNode<Integer>newhead=head.next;
        ptr=newhead;
        LinkedListNode<Integer>curr=head;
        head.next=null;
        while(ptr!=null && curr!=null){
            curr.next=ptr.next;
            if(ptr.next!=null) ptr.next=ptr.next.next;
            else ptr.next=null;
            ptr=ptr.next;
            curr=curr.next;
        }
        return newhead;
	}
}
