/************************************
	 
	 //Following is the class structure of the LinkedListNode class:
	 
	  class LinkedListNode<T> {
		public T data;
		public LinkedListNode<T> next;
		
		public LinkedListNode(T data) {
			this.data = data;
			this.next = null;
		}
	}

*****************************************/
public class Intersection_of_Two_LL {
    public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead) {
		int l1=0;
        int l2=0;
        LinkedListNode<Integer>ptr=firstHead;
        LinkedListNode<Integer>ptr1=secondHead;
        while(ptr!=null){
            l1++;
            ptr=ptr.next;
        }
        while(ptr1!=null){
            l2++;
            ptr1=ptr1.next;
        }
        int d=Math.abs(l1-l2);
        if(l1<l2){
            ptr=firstHead;
            ptr1=secondHead;
            for(int i=0;i<d;i++){
                ptr1=ptr1.next;
            }
        }
        else{
            ptr=firstHead;
            ptr1=secondHead;
            for(int i=0;i<d;i++){
                ptr=ptr.next;
            }
        }
        while(ptr!=null && ptr1!=null){
            if(ptr==ptr1) return ptr.data;
            ptr=ptr.next;
            ptr1=ptr1.next;
        }
        return -1;
	}
}
