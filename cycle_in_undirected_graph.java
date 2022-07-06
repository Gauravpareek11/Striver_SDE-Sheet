import java.util.ArrayList;
public class cycle_in_undirected_graph {
    public static boolean detectCycleInDirectedGraph(int n, ArrayList < ArrayList < Integer >> edges) {
    
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(ArrayList<Integer>l1:edges){
            adj.get(l1.get(0)-1).add(l1.get(1)-1);
        }
        boolean[] vis=new boolean[n];
        boolean dfs_vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                if(dfs(adj,i,vis,dfs_vis)) return true;
            }
        }
        return false;
    }
      static boolean dfs(ArrayList<ArrayList<Integer>>adj,int node,boolean[] vis,boolean[] dfs_vis){
          if(dfs_vis[node]) return true;
          if(vis[node]) return false;
          vis[node]=true;
          dfs_vis[node]=true;
          for(int i:adj.get(node)){
              if(dfs(adj,i,vis,dfs_vis)) return true;
          }
          dfs_vis[node]=false;
          return false;
      }
}
