class LinkedListNode {
    int data;
    LinkedListNode next;
    
    public LinkedListNode(int data) {
        this.data = data;
    }
}

public class Add_Two_Number_as_List {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        // Write your code here.
        int sum=0;
        int carry=0;
        LinkedListNode ptr=null;
        LinkedListNode head=null;
        while(head1!=null && head2!=null){
            sum=(head1.data+head2.data+carry)%10;
            carry=(head1.data+head2.data+carry)/10;
            if(head==null){
                ptr=new LinkedListNode(sum);
                head=ptr;
            }
            else{
                ptr.next=new LinkedListNode(sum);
                ptr=ptr.next;
            }
            head1=head1.next;
            head2=head2.next;
        }
        while(head1!=null){
            sum=(head1.data+carry)%10;
            carry=(head1.data+carry)/10;
            if(head==null){
                ptr=new LinkedListNode(sum);
                head=ptr;
            }
            else{
                ptr.next=new LinkedListNode(sum);
                ptr=ptr.next;
            }
            head1=head1.next;
        }
        while(head2!=null){
            sum=(head2.data+carry)%10;
            carry=(head2.data+carry)/10;
            if(head==null){
                ptr=new LinkedListNode(sum);
                head=ptr;
            }
            else{
                ptr.next=new LinkedListNode(sum);
                ptr=ptr.next;
            }
            head2=head2.next;
        }
        if(carry>0) ptr.next=new LinkedListNode(carry);
        return head;
    }
}
