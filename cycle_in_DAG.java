import java.util.*;
public class cycle_in_DAG{
    public static String cycleDetection(int[][] edges, int n, int m) {
        // Write your code here.
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int[]a:edges){
            adj.get(a[0]-1).add(a[1]-1);
            adj.get(a[1]-1).add(a[0]-1);
        }
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                if(dfs(adj,i,-1,vis)==true){
                    return "Yes";
                }
            }
        }
        return "No";
    }
    static boolean dfs(ArrayList<ArrayList<Integer>>adj,int node,int parent,boolean[] vis){
        vis[node]=true;
        for(int i:adj.get(node)){
            if(vis[i]==true && i!=parent){
                return true;
            }
            if(!vis[i]){
                if(dfs(adj,i,node,vis)) return true;
            }
        }
        return false;
    }
}