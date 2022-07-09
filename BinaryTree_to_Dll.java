
/*************************************************************
 class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

*************************************************************/

import java.util.*;
public class BinaryTree_to_Dll {
    public static BinaryTreeNode<Integer> BTtoDLL(BinaryTreeNode<Integer> root) {
		// Write your code here
        ArrayList<Integer>l1=new ArrayList<>();
        inorder(root,l1);
        BinaryTreeNode<Integer>head=null;
        BinaryTreeNode<Integer>prev=null;
        BinaryTreeNode<Integer>curr=null;
        for(int i:l1){
            if(head==null){
                head=new BinaryTreeNode<Integer>(i);
                curr=head;
                prev=head;
            }
            else{
                curr.right=new BinaryTreeNode<Integer>(i);
                prev=curr.right;
                curr=curr.right;
                
            }
        }
        return head;
        
	}
	static void inorder(BinaryTreeNode<Integer>root,ArrayList<Integer>l1){
        if(root==null){
            return;
        }
        inorder(root.left,l1);
        l1.add(root.data);
        inorder(root.right,l1);
    }
}
