import java.util.*;

public class Bellman_ford {
    static int bellmonFord(int n, int m, int src, int dest, ArrayList<ArrayList<Integer>> edges) {
        // Write your code here.
          int[] dist=new int[n+1];
          Arrays.fill(dist,(int)1e9);
          dist[src]=0;
          for(int i=1;i<n;i++){
              for(ArrayList<Integer>l1:edges){
                  if(dist[l1.get(0)]!=(int)1e9 && (dist[l1.get(0)]+l1.get(2)<dist[l1.get(1)])){
                      dist[l1.get(1)]=dist[l1.get(0)]+l1.get(2);
                  }
              }
          }
          return dist[dest];
      }
}
