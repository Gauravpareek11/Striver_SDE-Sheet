/*************************************************************

    Following is the Binary Tree node structure

    class BinaryTreeNode<Integer> {
        int data;
        BinaryTreeNode<Integer> left;
        BinaryTreeNode<Integer> right;

        public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

 *************************************************************/
import java.util.*;
public class partial_bst {
    public static boolean validateBST(BinaryTreeNode<Integer> root) {
        // Write your code here
        ArrayList<Integer>l1=new ArrayList<Integer>();
        inorder(root,l1);
        for(int i=0;i<l1.size()-1;i++){
            if(l1.get(i)>l1.get(i+1)) return false;
        }
        return true;
    }
    static void inorder(BinaryTreeNode<Integer>root,ArrayList<Integer>l1){
        if(root==null) return;
        
        inorder(root.left,l1);
        l1.add(root.data);
        inorder(root.right,l1);
    }
}
