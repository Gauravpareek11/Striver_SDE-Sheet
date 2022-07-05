import java.util.*;

public class BFS_in_a_graph {
    public static ArrayList<Integer> BFS(int vertex, int edges[][]){
		// WRITE YOUR CODE HERE
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<vertex;i++){
            adj.add(new ArrayList<>());
        }
//         System.out.println((edges[1][0]));
//         System.out.println(edges.length);
        for(int i=0;i<edges[0].length;i++){
            adj.get(edges[0][i]).add(edges[1][i]);
            adj.get(edges[1][i]).add(edges[0][i]);
        }
        for(int i=0;i<vertex;i++){
            Collections.sort(adj.get(i));
        }
       boolean[] vis=new boolean[vertex];
        ArrayList<Integer>ans=new ArrayList<>();
       for(int i=0;i<vis.length;i++){
           if(!vis[i]){
               bfs(i,ans,vis,adj);
           }
       }
        return ans;
	}
    static void bfs(int i,ArrayList<Integer>ans,boolean[] vis,ArrayList<ArrayList<Integer>>adj){
        Queue<Integer>q1=new LinkedList<>();
        q1.add(i);
        vis[i]=true;
        while(!q1.isEmpty()){
            int p=q1.poll();
            ans.add(p);
            for(int node:adj.get(p)){
                if(!vis[node]){
                    vis[node]=true;
                    q1.add(node);
                }
            }
        }
    }
}
