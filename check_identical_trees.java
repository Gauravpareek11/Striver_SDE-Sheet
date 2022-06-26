/*******************************************************

    Following is the BinaryTreeNode class structure:

    class BinaryTreeNode<T> {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;
        
        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }

*******************************************************/
public class check_identical_trees {
    public static boolean identicalTrees(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
        // Write you code here.
        return solve(root1,root2);
        
    }
    static boolean solve(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(!root1.data.equals(root2.data)) return false;
        return (solve(root1.left,root2.left) && solve(root1.right,root2.right));
    }
}
