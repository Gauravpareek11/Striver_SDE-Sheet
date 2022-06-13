

class Node
{
    public int data;
    public Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class Linked_list_cycle_2 {
    public static Node firstNode(Node head) 
    {
        //    Write your code here.
        if(head==null) return null;
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            if(slow==fast) break;
            slow=slow.next;
            fast=fast.next.next;
        }
//         System.out.println(slow.data+" "+fast.data);
        if(slow!=fast) return null;
        slow=slow.next;
        Node ptr=fast;
        int l=1;
        while(slow!=ptr){
            slow=slow.next;
            l++;
        }
//         System.out.println(l);
        Node ptr1=head;
        for(int i=0;i<l;i++){
            head=head.next;
        }
        while(ptr1!=head){
            ptr1=ptr1.next;
            head=head.next;
        }
        return head;
    }
}
