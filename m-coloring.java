import java.util.*;
// class Node{
//     int color;
//     HashSet<Integer>edges;
//     Node(){
//         edges=new HashSet<>();
//         this.color=1;
//     }
// }
class Node
{
    // A node class which stores the color and the edges
    // connected to the node
    int color = 1;
    Set<Integer> edges = new HashSet<Integer>();
}
class Solution {
	public static String graphColoring(int[][] mat, int m) {
        ArrayList<Node>adj=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            adj.add(new Node());
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]==1){
                    adj.get(i).edges.add(j);
                }
            }
        }
//         Queue<Node>q1=new LinkedList<Node>();
//         boolean vis[]=new boolean[mat.length];
//         for(int i=0;i<mat.length;i++){
//             if(!vis[i]) solve(i,q1,adj,m,vis);
//         }
//         HashSet<Integer>s1=new HashSet<>();
//         for(Node n:adj){
//             s1.add(n.color);
//         }
//         System.out.println(s1);
//         if(s1.size()<=m){
//             return "YES";
//         }
//         return "NO";
        return canPaint(adj,mat.length-1,m);
	}
//     static void solve(int node,Queue<Node>q1,ArrayList<Node>adj,int m,boolean vis[]){
//         vis[node]=true;
//         q1.add(adj.get(node));
//         while(!q1.isEmpty()){
//             Node p=q1.poll();
//             int c=p.color;
//             for(int it:p.edges){
//                 if(c==adj.get(it).color){
//                     adj.get(it).color+=1;
//                 }
//                 if(!vis[it]){
//                     vis[it]=true;
//                     q1.add(adj.get(it));
//                 }
//             }
//         }
//     }
// }


static String canPaint(ArrayList<Node> nodes, int n, int m)
    {
    
        // Create a visited array of n
        // nodes, initialized to zero
        ArrayList<Integer> visited = new ArrayList<Integer>();
        for(int i = 0; i < n + 1; i++)
        {
            visited.add(0);
        }
        
        // maxColors used till now are 1 as
        // all nodes are painted color 1
        int maxColors = 1;
        
        // Do a full BFS traversal from
        // all unvisited starting points
        for (int sv = 1; sv <= n; sv++)
        {
            if (visited.get(sv) > 0)
            {
                continue;
            }
        
            // If the starting point is unvisited,
            // mark it visited and push it in queue
            visited.set(sv, 1);
            Queue<Integer> q = new LinkedList<>();
            q.add(sv);
            
            // BFS Travel starts here
            while(q.size() != 0)
            {
                int top = q.peek();
                q.remove();
                
                // Checking all adjacent nodes
                // to "top" edge in our queue
                for(int it: nodes.get(top).edges)
                {
                
                    // IMPORTANT: If the color of the
                    // adjacent node is same, increase it by 1
                    if(nodes.get(top).color == nodes.get(it).color)
                    {
                        nodes.get(it).color += 1;
                    }
                
                    // If number of colors used shoots m, return
                    // 0
                    maxColors = Math.max(maxColors,
                                        Math.max(nodes.get(top).color,
                                                nodes.get(it).color));
                    if (maxColors > m)
                        return "NO";
                
                    // If the adjacent node is not visited,
                    // mark it visited and push it in queue
                    if (visited.get(it) == 0)
                    {
                        visited.set(it, 1);
                        q.add(it);
                    }
                }
                
            }
        }
        return "YES";
    }
}

