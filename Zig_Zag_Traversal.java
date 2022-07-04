import java.util.*;
class pair{
    BinaryTreeNode<Integer> node;
    int level;
    pair(BinaryTreeNode<Integer> node,int level){
        this.node=node;
        this.level=level;
    }
}
public class Zig_Zag_Traversal {
    /*
	Following is the class used to represent the object/node of the Binary Tree

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}
*/
public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {
    List<Integer>ans=new ArrayList<Integer>();
    if(root==null){
        return ans;
    }
    HashMap<Integer,ArrayList<Integer>>m1=new HashMap<>();
    Queue<pair>q1=new LinkedList<>();
    q1.add(new pair(root,0));
    while(!q1.isEmpty()){
        pair p=q1.poll();
        if(m1.containsKey(p.level)){
            m1.get(p.level).add(p.node.data);
        }
        else{
            ArrayList<Integer>temp=new ArrayList<>();
            temp.add(p.node.data);
            m1.put(p.level,temp);
        }
        if(p.node.left!=null) q1.add(new pair(p.node.left,p.level+1));
        if(p.node.right!=null) q1.add(new pair(p.node.right,p.level+1));
    }
    boolean f=true;
    for(int i:m1.keySet()){
        if(f){
            ans.addAll(m1.get(i));
            f=false;
        }
        else{
            Collections.reverse(m1.get(i));
            ans.addAll(m1.get(i));
            f=true;
        }
    }
    return ans;
    }
}
