import java.util.*;
public class Topological_sort {
    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) 
    {
        // Write your code here
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
        int[] indegree=new int[v];
//         System.out.println(edges);
        for(int i=0;i<e;i++){
            adj.get(edges.get(i).get(0)).add(edges.get(i).get(1));
            indegree[edges.get(i).get(1)]++;
        }
        Queue<Integer>q1=new LinkedList<Integer>();
        for(int i=0;i<v;i++){
            if(indegree[i]==0) q1.add(i);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        while(!q1.isEmpty()){
            int p=q1.poll();
            ans.add(p);
            for(int i:adj.get(p)){
                indegree[i]--;
                if(indegree[i]==0){
                    q1.add(i);
                }
            }
        }
        return ans;
    }
}
