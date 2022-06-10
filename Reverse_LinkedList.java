
class LinkedListNode<T> 
{
    T data;
    LinkedListNode<T> next;
    public LinkedListNode(T data) 
    {
        this.data = data;
    }
}

public class Reverse_LinkedList {
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
        LinkedListNode<Integer>ptr=head;
        LinkedListNode<Integer>next=null;
        LinkedListNode<Integer>prev=null;
        while(ptr!=null){
            next=ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=next;
        }
        return prev;
    }
}
