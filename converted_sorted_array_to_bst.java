import java.util.ArrayList;
public class converted_sorted_array_to_bst {
    /****************************************************************

    Following is the class structure of the TreeNode class:

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


*****************************************************************/
    public static TreeNode<Integer> sortedArrToBST(ArrayList<Integer> arr, int n) {
        // Write your code here.
        return solve(arr,0,n-1);
        
    }
   static TreeNode<Integer> solve(ArrayList<Integer>arr,int i,int j){
        if(i>j) return null;
        if(i==j) return new TreeNode<>(arr.get(i));
        int mid=i+(j-i)/2;
        TreeNode<Integer>root=new TreeNode<>(arr.get(mid));
        root.left=solve(arr,i,mid-1);
        root.right=solve(arr,mid+1,j);
        return root;
    }
}
