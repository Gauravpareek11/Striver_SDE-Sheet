
/****************************************************************
	
	Following is the structure of the Singly Linked List.
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

****************************************************************/

public class Delete_kth_Node_from_end {
    public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int K) {
        if(head==null || K==0) return head;
		// Write your code here.
        LinkedListNode<Integer>ptr=reverse(head);
        LinkedListNode<Integer>ptr1=ptr;
        LinkedListNode<Integer>prev=null;
        for(int i=1;i<K;i++){
            prev=ptr;
            ptr=ptr.next;
        }
        if(prev==null){
            ptr1=ptr.next;
            ptr=null;
        }
        else {
//             System.out.println(prev.data+" "+ptr.data);
            prev.next=ptr.next;
//         ptr=null;
        }
        return reverse(ptr1);
	}
    static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        LinkedListNode<Integer> ptr=head;
        LinkedListNode<Integer> next=null;
        LinkedListNode<Integer> prev=null;
        while(ptr!=null){
            next=ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=next;
        }
        return prev;
    }
}
