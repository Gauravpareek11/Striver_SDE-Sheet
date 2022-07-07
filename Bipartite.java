import java.util.*;
public class Bipartite {
    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> edges) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<edges.size();i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.size();i++){
            for(int j=0;j<edges.size();j++){
                if(edges.get(i).get(j)==1){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int[] colour=new int[edges.size()];
        Arrays.fill(colour,-1);
//         boolean[] vis=new boolean[edges.size()];
        for(int i=0;i<edges.size();i++){
            if(colour[i]==-1){
                if(!dfs(i,0,colour,adj)){
                    return false;
                }
            }
        }
        return true;
    }
   static boolean dfs(int node,int c,int[] colour,ArrayList<ArrayList<Integer>>adj){
//         vis[node]=true;
        if(colour[node]!=-1 && colour[node]!=c) return false;
        colour[node]=c;
//         c=1-c;
       boolean ans=true;
        for(int i:adj.get(node)){
            if(colour[i]==-1){
                ans&=dfs(i,1-c,colour,adj);
            }
            if(colour[i]!=-1 && colour[i]==colour[node]) return false;
        }
        return ans;
    }
}
