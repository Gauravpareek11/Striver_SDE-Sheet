import java.util.*;
class pair{
    int v;
    int dis;
    pair(int v,int dis){
        this.v=v;
        this.dis=dis;
    }
}
public class Dijkstra {
    public static ArrayList < Integer > dijkstra(ArrayList< ArrayList < Integer > > vec, int vertices, int edges, int source){
		// Write your code here.
        ArrayList<ArrayList<pair>>adj=new ArrayList<>();
        for(int i=0;i<vertices;i++){
            adj.add(new ArrayList<>());
        }
        for(ArrayList<Integer>l1:vec){
            adj.get(l1.get(0)).add(new pair(l1.get(1),l1.get(2)));
            adj.get(l1.get(1)).add(new pair(l1.get(0),l1.get(2)));
        }
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->Integer.compare(a.dis,b.dis));
        int[] dis=new int[vertices];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[source]=0;
        pq.add(new pair(source,0));
        while(!pq.isEmpty()){
            pair p=pq.poll();
            for(pair i:adj.get(p.v)){
                if(dis[p.v]+i.dis<dis[i.v]){
                    dis[i.v]=dis[p.v]+i.dis;
                    pq.add(new pair(i.v,dis[p.v]+i.dis));
                }
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i:dis){
            ans.add(i);
        }
        return ans;
	}
}
