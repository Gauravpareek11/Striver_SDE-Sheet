/*****************************************************************

    Following is the representation for the Binary Tree Node:

    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

****************************************************************/
public class Symmetric_trees {
    public static boolean isSymmetric(BinaryTreeNode<Integer> root) {
        // Write your code here.
        if(root==null) return true;
        return solve(root.left,root.right);
    }
    static boolean solve(BinaryTreeNode<Integer>root,BinaryTreeNode<Integer>root2){
        if(root==null && root2==null) return true;
        if(root==null || root2==null) return false;
        if(!root.data.equals(root2.data)) return false;
        return(solve(root.left,root2.right)&&solve(root.right,root2.left));
    }
}
