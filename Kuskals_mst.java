import java.util.*;
public class Kuskals_mst {
    public static int kruskalMST(int n, int m, ArrayList<ArrayList<Integer>> graph) {
        // Write your code here.
        int[] parent=new int[n+1];
        int[] rank=new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i]=i;
        }
        Collections.sort(graph,(a,b)->Integer.compare(a.get(2),b.get(2)));
        int ans=0;
        for(int i=0;i<graph.size();i++){
       if(findPar(graph.get(i).get(0),parent)!=findPar(graph.get(i).get(1),parent)){
                ans+=graph.get(i).get(2);
                union(graph.get(i).get(0),graph.get(i).get(1),rank,parent);
//                System.out.println(Arrays.toString(parent));
//                System.out.println(Arrays.toString(rank));
            }
        }
        return ans;
    }
    static int findPar(int node,int[] parent){
        if(node==parent[node]){
            return node;
        }
       return parent[node]=findPar(parent[node],parent);
    }
    static void union(int u,int v,int[] rank,int[] parent){
        int par_u=findPar(u,parent);
        int par_v=findPar(v,parent);
        
        if(rank[par_u]<rank[par_v]){
            parent[par_u]=par_v;
        }
        else if(rank[par_u]>rank[par_v]){
            parent[par_v]=par_u;
        }
        else{
            parent[par_v]=par_u;
            rank[par_u]++;
        }
    }
}
