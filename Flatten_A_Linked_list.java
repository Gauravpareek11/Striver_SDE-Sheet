class Node {
    int data;
    Node next;
    Node child;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.child = null;
    }
}

public class Flatten_A_Linked_list {
    static Node mergeTwoLists(Node a, Node b) {                
        Node temp = new Node(0);        
        Node res = temp;                 
        while(a != null && b != null) {            
            if(a.data < b.data) {                
                temp.child = a;                 
                temp = temp.child;                 
                a = a.child;             
            }            
            else {                
                temp.child = b;                
                temp = temp.child;                 
                b = b.child;             
            }        
        }                
        if(a != null) temp.child = a;         
        else temp.child = b;        
        return res.child;         
    }   
    static Node flatten(Node root)    
    {                   
        if (root == null || root.next == null)                 
            return root;                         
        root.next = flatten(root.next);
        root = mergeTwoLists(root, root.next);
        return root;     
    } 
    public static Node flattenLinkedList(Node start) {   
        return flatten(start); 
    } 
}
