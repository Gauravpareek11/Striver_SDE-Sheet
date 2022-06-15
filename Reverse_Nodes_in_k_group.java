

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
};
public class Reverse_Nodes_in_k_group {
    public static Node getListAfterReverseOperation(Node head, int n, int b[]) {
		// Write your code here
        if(head==null) return head;
        Node ptr=head;
        int l=0;
        while(ptr!=null){
            ptr=ptr.next;
            l++;
        }
        ptr=head;
        Node newhead=null;
        Node curr=null;
        for(int k:b){
            if(k==0) continue;
            Node temp=ptr;
            for(int i=0;i<Math.min(k,l);i++){
                temp=temp.next;
            }
//             System.out.println(temp.data);
            if(newhead==null){ 
                newhead=reverse(ptr,k);
//                 System.out.println(newhead.data);
                 curr=newhead;
                while(curr.next!=null){
                    curr=curr.next;
                }
                curr.next=temp;
            }
            else{
                curr.next=reverse(ptr,k);
                while(curr.next!=null){
                    curr=curr.next;
                }
                curr.next=temp;
            }
            
            ptr=temp;
            l-=Math.min(k,l);
            if(l==0){
                break;
            }
        }
        return newhead==null?head:newhead;
	}
    static Node reverse(Node head,int k){
        Node prev=null;
        Node next=null;
        while(head!=null && k>0){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
            k--;
        }
        return prev;
    }
}
