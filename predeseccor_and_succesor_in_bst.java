/*************************************************************
    Following is the Binary Tree node structure

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
public class predeseccor_and_succesor_in_bst {
    public static ArrayList<Integer> predecessorSuccessor(BinaryTreeNode<Integer> root, int key) {
		// Write your code here.
        ArrayList<Integer>ans=new ArrayList<>();
        ArrayList<Integer>l1=new ArrayList<>();
        inorder(root,l1);
       int prev=-1;
        int i=0;
        for(i=0;i<l1.size();i++){
            if(l1.get(i)==key){
                ans.add(prev);
                break;
            }
            prev=l1.get(i);
        }
        if(i==l1.size()-1){
            ans.add(-1);
        }
        else ans.add(l1.get(i+1));
        return ans;
	}
    static void inorder(BinaryTreeNode<Integer>root,ArrayList<Integer>l1){
        if(root==null) return;
        inorder(root.left,l1);
        l1.add(root.data);
        inorder(root.right,l1);
    }
}
