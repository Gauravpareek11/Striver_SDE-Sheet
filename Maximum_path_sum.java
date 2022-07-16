/************************************************************

    Following is the Tree node structure
	
	class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

************************************************************/

public class Maximum_path_sum {
    static int count=0;
    public static long findMaxSumPath(TreeNode root) {
		// Write your code here.
//         int maxii=0;
        count=0;
        long[] a=new long[1];
        a[0]=-1;
        solve(root,a);
        if(count<=1) return -1;
        return a[0];
	}
    static long solve(TreeNode root,long[] a){
        if(root==null) return 0;
        if(root.left==null && root.right==null) count++;
        long l=solve(root.left,a);
        long r=solve(root.right,a);
        a[0]=Math.max(a[0],root.data+l+r);
        return root.data+Math.max(l,r);
    }
}
