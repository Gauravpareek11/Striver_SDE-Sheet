 
 
/*************************************************************
	Following is the Binary Tree node structure
	class TreeNode<T> {
		public T data;
		public TreeNode<T> left;
		public TreeNode<T> right;

		TreeNode(T data) {
			this.data = data;
			left = right = null;
		}

};************************************************************/
public class bst_from_preorder {
    public static TreeNode<Integer> preOrderTree(int[] preOrder) {
        // Write your code here
       return solve(preOrder,0,preOrder.length-1);
   }
   static TreeNode<Integer>solve(int[] a,int i,int j){
       if(i>j) return null;
       if(i==j) return new TreeNode(a[i]);
       int just_greater=search(a,i+1,j,a[i]);
       TreeNode<Integer>root=new TreeNode(a[i]);
       if(i+1<=just_greater-1) root.left=solve(a,i+1,just_greater-1);
       if(j>=just_greater) root.right=solve(a,just_greater,j);
       return root;
   }
   static int search(int[] a,int low,int high,int target){
       int ans=-1;
       while(low<=high){
           int mid=low+(high-low)/2;
           if(a[mid]>target){
               ans=mid;
               high=mid-1;
           }
           else low=mid+1;
       }
       if(ans==-1) ans=high+1;
       return ans;
   } 
}
