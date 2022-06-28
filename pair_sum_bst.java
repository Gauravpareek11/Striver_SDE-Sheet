/*************************************************************
    
    Following is the Binary Tree node structure:

    class BinaryTreeNode {

	int data;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	BinaryTreeNode(int data) {
		this.data = data;
		left = null;
		right = null;
	   }
    }

*************************************************************/
import java.util.*;
public class pair_sum_bst {
    public static boolean pairSumBst(BinaryTreeNode root, int k) {
		// Write your code here.
        ArrayList<Integer>l1=new ArrayList<>();
        solve(root,l1);
        int i=0;
        int j=l1.size()-1;
        while(i<j){
            if(l1.get(i)+l1.get(j)==k) return true;
            else if(l1.get(i)+l1.get(j)<k) i++;
            else j--;
        }
        return false;
	}
    static void solve(BinaryTreeNode root,ArrayList<Integer>l1){
        if(root==null) return;
        solve(root.left,l1);
        l1.add(root.data);
        solve(root.right,l1);
    }
}
