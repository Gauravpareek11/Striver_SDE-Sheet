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
public class inorder {
    public static List < Integer > getInOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer>l1=new ArrayList<>();
        inorder(root,l1);
        return l1;
    }
    static void inorder(TreeNode root,List<Integer>l1){
        if(root==null) return;
        inorder(root.left,l1);
        l1.add(root.data);
        inorder(root.right,l1);
    }
}
