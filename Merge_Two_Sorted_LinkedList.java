
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Merge_Two_Sorted_LinkedList {
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        LinkedListNode<Integer>newHead=null;
        LinkedListNode<Integer>ptr=null;
        while(first!=null && second!=null){
            if(first.data<second.data){
                if(newHead==null){
                    ptr=new LinkedListNode<Integer>(first.data);
                    newHead=ptr;
                }
                else{
                    ptr.next=new LinkedListNode<Integer>(first.data);
                    ptr=ptr.next;
                }
                first=first.next;
            }
            else{
                if(newHead==null){
                    ptr=new LinkedListNode<Integer>(second.data);
                    newHead=ptr;
                }
                else{
                    ptr.next=new LinkedListNode<Integer>(second.data);
                    ptr=ptr.next;
                }
                second=second.next;
            }
        }
        while(first!=null){
            if(newHead==null){
                    ptr=new LinkedListNode<Integer>(first.data);
                    newHead=ptr;
                }
            else{
                ptr.next=new LinkedListNode<Integer>(first.data);
                ptr=ptr.next;
            }
            first=first.next;
        }
        while(second!=null){
            if(newHead==null){
                    ptr=new LinkedListNode<Integer>(second.data);
                    newHead=ptr;
                }
            else{
                ptr.next=new LinkedListNode<Integer>(second.data);
                ptr=ptr.next;
            }
            second=second.next;
        }
        return newHead;
	}
}
