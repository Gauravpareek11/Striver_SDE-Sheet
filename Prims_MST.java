import java.util.*;
public class Prims_MST {
    public static ArrayList<ArrayList<Integer>> calculatePrimsMST(int n, int m, ArrayList<ArrayList<Integer>> g)
    {
        // Write your code here.
        ArrayList<ArrayList<ArrayList<Integer>>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(ArrayList<Integer>temp:g){
            ArrayList<Integer>l1=new ArrayList<>();
            l1.add(temp.get(1)-1);
            l1.add(temp.get(2));
            adj.get(temp.get(0)-1).add(l1);
            
            ArrayList<Integer>l2=new ArrayList<>();
            l2.add(temp.get(0)-1);
            l2.add(temp.get(2));
            adj.get(temp.get(1)-1).add(l2);
        }
        PriorityQueue<ArrayList<Integer>>pq=new PriorityQueue<>((a,b)->Integer.compare(a.get(1),b.get(1)));
        ArrayList<Integer>temp1=new ArrayList<Integer>();
        temp1.add(0);
        temp1.add(0);
        pq.add(temp1);
        int[] key=new int[n];
        int[] parent=new int[n];
        boolean[] mst=new boolean[n];
        for(int i=0;i<n;i++){
            key[i]=(int)1e9;
            mst[i]=false;
        }
        key[0]=0;
        parent[0]=-1;
        while(!pq.isEmpty()){
            ArrayList<Integer>l1=pq.poll();
            
            mst[l1.get(0)]=true;
            for(ArrayList<Integer>l2:adj.get(l1.get(0))){
                if(mst[l2.get(0)]==false && key[l2.get(0)]>l2.get(1)){
                    key[l2.get(0)]=l2.get(1);
                    parent[l2.get(0)]=l1.get(0);
                    
                    ArrayList<Integer>temp2=new ArrayList<Integer>();
                    temp2.add(l2.get(0));
                    temp2.add(l2.get(1));
                    pq.add(temp2);
                }
            }
        }
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int i=2;i<=n;i++){
            ArrayList<Integer>temp3=new ArrayList<Integer>();
            temp3.add(parent[i-1]+1);
            temp3.add(i);
            temp3.add(key[i-1]);
            ans.add(temp3);
        }
        return ans;
    }
}



