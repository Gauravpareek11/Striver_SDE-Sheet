/*
	
	Following is the Binary Tree node structure:

	public class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;
	    TreeNode() {}
	    TreeNode(int val) { this.data = val; }
	    TreeNode(int val, TreeNode left, TreeNode right) {
	       this.data = val;
	        this.left = left;
	        this.right = right;
	    }
	}

*/
import java.util.*;
public class preorder {
    public static List < Integer > getPreOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer>l1=new ArrayList<>();
        preorder(root,l1);
        return l1;
    }
    static void preorder(TreeNode root,List<Integer>l1){
        if(root==null) return;
        l1.add(root.data);
        preorder(root.left,l1);
        preorder(root.right,l1);
    }
}
