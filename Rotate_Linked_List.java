class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}
public class Rotate_Linked_List {
    public static Node rotate(Node head, int k) {
        if(head==null || head.next==null || k==0) return head;
        Node prev=null;
        Node ptr=head;
        Node curr=head;
        int l=0;
        while(curr!=null){
            curr=curr.next;
            l++;
        }
        k=k%l;
//         System.out.println(k);
        if(k==0) return head;
        for(int i=0;i<l-k;i++){
            prev=ptr;
            ptr=ptr.next;
        }
        prev.next=null;
        Node x=ptr;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=head;
        return x;
    }
}
