import java.util.*;
class pair{
    TreeNode<Integer> node;
    int value;
    pair(TreeNode<Integer>node,int value){
        this.node=node;
        this.value=value;
    }
}
public class Vertical_Order_Traversal {
    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root) 
    {
        ArrayList<pair>l1=new ArrayList<>();
        Queue<pair>q1=new LinkedList<>();
        q1.add(new pair(root,0));
        while(!q1.isEmpty()){
            pair p=q1.poll();
            l1.add(p);
            if(p.node.left!=null) q1.add(new pair(p.node.left,p.value-1));
            if(p.node.right!=null) q1.add(new pair(p.node.right,p.value+1));
        }
        Collections.sort(l1,(a,b)->Integer.compare(a.value,b.value));
        ArrayList<Integer>ans=new ArrayList<>();
        for(pair p:l1){
            ans.add(p.node.data);
        }
        return ans;
        //    Write your code here.
        
    }
}
