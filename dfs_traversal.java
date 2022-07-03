import java.util.*;
public class dfs_traversal{
    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        for(ArrayList<Integer>l1:edges){
            adj.get(l1.get(0)).add(l1.get(1));
            adj.get(l1.get(1)).add(l1.get(0));
        }
        boolean[] vis=new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                ArrayList<Integer>l1=new ArrayList<Integer>();
                dfs(i,adj,vis,l1);
                ans.add(l1);
            }
        }
//         System.out.println(ans);
        return ans;
    }
    static void dfs(int node,ArrayList<ArrayList<Integer>>adj,boolean[] vis,ArrayList<Integer>l1){
        l1.add(node);
        vis[node]=true;
        for(int i:adj.get(node)){
            if(!vis[i]) dfs(i,adj,vis,l1);
        }
    }
}