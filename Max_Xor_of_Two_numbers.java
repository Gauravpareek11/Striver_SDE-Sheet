class Node{
    Node[] link=new Node[2];
    
    boolean containsKey(int x){
        return (link[x]!=null);
    }
    Node get(int x){
        return link[x];
    }
    void put(int x,Node temp){
        link[x]=temp;
    }
}
class Solution {
    static Node root;
    public static int maximumXor(int[] A) {
       root=new Node();
       for(int i:A){
           insert(i);
       }
        int max=0;
        for(int i:A){
            max=Math.max(max,max(i));
        }
        return max;
    }
    static void insert(int num){
        Node node=root;
        for(int i=31;i>=0;i--){
            int bit=(num>>i)&1;
            if(!node.containsKey(bit)){
                node.put(bit,new Node());
            }
            node=node.get(bit);
        }
    }
    static int max(int num){
        Node node=root;
        int max=0;
        for(int i=31;i>=0;i--){
            int bit=(num>>i)&1;
            int xbit=bit==0?1:0;
            if(node.containsKey(xbit)){
                max=(max|(1<<i));
                node=node.get(xbit);
            }
            else node=node.get(bit);
        }
        return max;
    }
}
