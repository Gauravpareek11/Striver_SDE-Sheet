/*************************************************************

Following is the Binary Tree Node structure:

    class TreeNode<T> {
		public T data;
		public BinaryTreeNode<T> left;
		public BinaryTreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = null;
			right = null;
	  	}
    }

*************************************************************/
public class diameter_of_a_tree {
    public static int diameterOfBinaryTree(TreeNode<Integer> root) {
		// Write your code here.
        return diameter(root);
	}
    static int diameter(TreeNode<Integer>root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        return Math.max(Math.max(ld,rd),lh+rh);
//         return lh+rh;
    }
    static int height(TreeNode<Integer>root){
        if(root==null) return 0;
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    }
}
