/************************************************************
  
   Following is the TreeNode class structure
   
   class TreeNode<T> { 
        T data; 
        TreeNode<T> left;
        TreeNode<T> right;
  
        TreeNode(T data) { 
            this.data = data; 
            left = null; 
            right = null; 
        }
   }
    
 ************************************************************/
import java.util.*;
public class Construct_BT_from_postOrder_inOrder {
    static int index=0;
	public static TreeNode<Integer> getTreeFromPostorderAndInorder(int[] postOrder, int[] inOrder) {
		// Write your code here.
        if(inOrder==null||postOrder==null||inOrder.length!=postOrder.length)                 return null;
        HashMap<Integer,Integer>m1=new HashMap<>();
        for(int i=0;i<inOrder.length;i++){
            m1.put(inOrder[i],i);
        }
        index=postOrder.length-1;
        return solve(postOrder,m1,0,inOrder.length-1);
	}
    static TreeNode<Integer> solve(int[] postorder,HashMap<Integer,Integer>m1,int i,int j){
        if(i>j || index<0) return null;
        int data=postorder[index--];
        int get_index=m1.get(data);
        TreeNode temp=new TreeNode(data);
        if(i==j) return temp;
        temp.right=solve(postorder,m1,get_index+1,j);
        temp.left=solve(postorder,m1,i,get_index-1);
        return temp;
    }
}
