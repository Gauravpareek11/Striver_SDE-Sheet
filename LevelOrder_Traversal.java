import java.util.*;
public class LevelOrder_Traversal {
    public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
        //Your code goes here
          ArrayList<Integer>ans=new ArrayList<>();
          if(root==null) return ans;
          Queue<BinaryTreeNode>q1=new LinkedList<>();
          q1.add(root);
          while(!q1.isEmpty()){
              BinaryTreeNode node=q1.poll();
              ans.add(node.val);
              if(node.left!=null) q1.add(node.left);
              if(node.right!=null) q1.add(node.right);
          }
          return ans;
      }
    
}
