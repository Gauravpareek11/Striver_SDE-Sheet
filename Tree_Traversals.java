/************************************************************

	Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}

************************************************************/
import java.util.*;
public class Tree_Traversals {
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        List<Integer>l3=new ArrayList<>();
        inorder(root,l1);
        preorder(root,l2);
        postorder(root,l3);
        ans.add(l1);
        ans.add(l2);
        ans.add(l3);
        return ans;
    }
    static void inorder(BinaryTreeNode<Integer> root,List<Integer>l1){
        if(root==null) return;
        inorder(root.left,l1);
        l1.add(root.data);
        inorder(root.right,l1);
    }
    static void preorder(BinaryTreeNode<Integer>root,List<Integer>l1){
        if(root==null) return;
        l1.add(root.data);
        preorder(root.left,l1);
        preorder(root.right,l1);
    }
    static void postorder(BinaryTreeNode<Integer> root,List<Integer>l1){
        if(root==null) return;
        postorder(root.left,l1);
        postorder(root.right,l1);
        l1.add(root.data);
    }
}
