/************************************************************

    Following is the TreeNode class structure

    class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	   }
	}


************************************************************/
import java.util.*;
public class Maximum_width_binarytree {
    public static int getMaxWidth(TreeNode root) {
        if(root==null) return 0;
		// Write your code here.
//         HashMap<TreeNode,Integer>m1=new HashMap<>();
        ArrayList<ArrayList<TreeNode>>l1=new ArrayList<>();
//         solve(root,l1,0);
//         int max=0;
        Queue<TreeNode>q1=new LinkedList<>();
        q1.add(root);
        int ans=0;
        while(!q1.isEmpty()){
            ans=Math.max(ans,q1.size());
            int n=q1.size();
            for(int i=0;i<n;i++){
                TreeNode temp=q1.peek();
                q1.poll();
                if(temp.left!=null) q1.add(temp.left);
                if(temp.right!=null) q1.add(temp.right);
            }
        }
//              System.out.println(temp.get(0).val+" "+temp.get(temp.size()-1).val);
//             if(m1.get(temp.get(temp.size()-1))-m1.get(temp.get(0))>=max){
//                 max=Math.max(max,m1.get(temp.get(temp.size()-1))-m1.get(temp.get(0)));
//                 ans=Math.max(ans,temp.size());
//    
        return ans;
	}
//     static void solve(TreeNode root,ArrayList<ArrayList<TreeNode>>l1,int level){
//         if(root==null) return;
//         try{
//             l1.get(level).add(root);
// //             m1.put(root,d);
//         }
//         catch(Exception e){
//             ArrayList<TreeNode>temp=new ArrayList<>();
//             temp.add(root);
// //             m1.put(root,d);
//             l1.add(temp);
//         }
//         if(root.left!=null) solve(root.left,l1,level+1);
//         if(root.right!=null) solve(root.right,l1,level+1);
//     }
}
