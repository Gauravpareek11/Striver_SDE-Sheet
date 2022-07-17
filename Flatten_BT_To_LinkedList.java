/************************************************************

    Following is the TreeNode class structure.

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
public class Solution 
{
    public static TreeNode<Integer> flattenBinaryTree(TreeNode<Integer> root)
    {
        // Write your code here.
        ArrayList<Integer>l1=new ArrayList<>();
        solve(root,l1);
        TreeNode<Integer>ans=null;
        TreeNode<Integer>ptr=null;
        for(int i=0;i<l1.size();i++){
            if(ans==null){
                ans=new TreeNode<>(l1.get(i));
                ptr=ans;
            }
            else{
                ptr.right=new TreeNode<>(l1.get(i));
                ptr=ptr.right;
            }
        }
        return ans;
    }
    static void solve(TreeNode<Integer>root,ArrayList<Integer>l1){
        if(root==null) return;
        
        l1.add(root.data);
        solve(root.left,l1);
        solve(root.right,l1);
    }
}