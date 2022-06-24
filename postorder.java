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
public class postorder {
    public static List < Integer > getPostOrderTraversal(TreeNode root) {
    	// Write your code here.
        List<Integer>l1=new ArrayList<>();
        postorder(root,l1);
        return l1;
    }
    static void postorder(TreeNode root,List<Integer>l1){
        if(root==null) return;
        postorder(root.left,l1);
        postorder(root.right,l1);
        l1.add(root.data);
    }
}
