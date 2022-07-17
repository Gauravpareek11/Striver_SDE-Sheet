import java.util.*;
public class BSt_Iterartor {
    static class BSTIterator{
        static ArrayList<Integer>l1;
        int i;
        BSTIterator(TreeNode<Integer> root){
            // Write your code here
            l1=new ArrayList<>();
            i=0;
            solve(root,l1);
        }

        int next(){
            if(i==l1.size()) return -1;
            return l1.get(i++);
            // Write your code here
        }

        boolean hasNext(){
            return i<l1.size();
            // Write your code here
        }
        private void solve(TreeNode<Integer>root,ArrayList<Integer>l1){
            if(root==null) return;
            
            solve(root.left,l1);
            l1.add(root.data);
            solve(root.right,l1);
        }
    }
}
