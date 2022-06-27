/*************************************************************
    Following is the Binary Search Tree node structure

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************/

import java.util.ArrayList;
public class Kth_largest_element {
    public static int KthLargestNumber(TreeNode<Integer> root, int k) {
		// Write your code here.
        ArrayList<Integer>l1=new ArrayList<>();
        solve(root,l1);
        if(l1.size()-k<0) return -1;
        return l1.get(l1.size()-k);
	}
    static void solve(TreeNode<Integer>root,ArrayList<Integer>l1){
        if(root==null){
            return;
        }
        solve(root.left,l1);
        l1.add(root.data);
        solve(root.right,l1);
    }
}
