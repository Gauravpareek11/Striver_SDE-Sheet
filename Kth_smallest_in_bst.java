/************************************************************

    Following is the TreeNode class structure

	class TreeNode<T> 
	{
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) 
	    {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

************************************************************/

import java.util.*;
public class Kth_smallest_in_bst {
    public static int kthSmallest(TreeNode<Integer> root, int k) 
	{
		//  Write your code here.
        ArrayList<Integer>l1=new ArrayList<Integer>();
        solve(root,l1);
        if(k-1>=l1.size()) return -1;
        return l1.get(k-1);
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
