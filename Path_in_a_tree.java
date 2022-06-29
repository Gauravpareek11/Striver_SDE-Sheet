/*   
    Following is the Binary Tree node structure for referance:

    class TreeNode
    {
        int data;
        TreeNode left, right;
    
        public TreeNode(int item)
        {
            data = item;
            left = right = null;
        }
    }
*/
import java.util.*;
public class Path_in_a_tree {
    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        // Write your code here..
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        solve(root,l1,ans,x);
        return ans;
        
    }
    static void solve(TreeNode root,ArrayList<Integer>l1,ArrayList<Integer>ans,int x){
        if(root==null){
            return;
        }
        l1.add(root.data);
//         System.out.println(l1);
        if(root.data==x){
            ans.addAll(l1);
            return;
        }
       solve(root.left,l1,ans,x);
       solve(root.right,l1,ans,x);
       l1.remove(l1.size()-1); 
    }
}
