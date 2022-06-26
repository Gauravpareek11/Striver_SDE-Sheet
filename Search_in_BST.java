/*
    Following is the Binary Tree node structure:

	class BinaryTreeNode<T> {
	    public T data;
	    public BinaryTreeNode<T> left;
	    public BinaryTreeNode<T> right;

	    BinaryTreeNode(T data) {
	        this.data = data;
	        this.left = null;
	        this.right = null;
	    }
	}
*/
public class Search_in_BST {
    public static Boolean searchInBST(BinaryTreeNode<Integer> root, int x) {
		// Write your code here.
        while(root!=null){
            if(root.data.equals(x)) return true;
            else if(root.data<x){
                root=root.right;
            }
            else root=root.left;
        }
        return false;
	}
}
