/****************************************************************

    Following is the class structure of the LinkedListNode class:
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

*****************************************************************/
public class Palindrome_Linked_List {
    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        LinkedListNode<Integer>slow=head;
        LinkedListNode<Integer>fast=head;
        LinkedListNode<Integer>prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null){
            prev=slow;
            slow=slow.next;
        }
        LinkedListNode<Integer>ptr=reverse(slow,prev);
        LinkedListNode<Integer>curr=head;
        while(curr!=slow){
            if(!ptr.data.equals(curr.data)) return false;
            ptr=ptr.next;
            curr=curr.next;
        }
        return true;
	}
    static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head,LinkedListNode<Integer>prev){
        LinkedListNode<Integer>ptr=head;
        LinkedListNode<Integer>next=null;
        while(ptr!=null){
            next=ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=next;
        }
        return prev;
    }
}
