import java.util.* ;
public class Pair_Sum{
    public static int[][] pairSum(int[] arr, int s) {
        // Write your code here.
        Arrays.sort(arr);
        ArrayList<int[]>l1=new ArrayList<>();
        HashMap<Integer,Integer>m1=new HashMap<>();
        for(int i:arr){
            if(m1.containsKey(i)) m1.put(i,m1.get(i)+1);
            else m1.put(i,1);
        }
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==s){
                int[] t=new int[2];
                t[0]=arr[i];
                t[1]=arr[j];
                i++;
                j--;
                int k=0;
                if(t[0]==t[1]){
                    k=m1.get(t[0]);
                    k=k*(k-1)/2;
                }
                else k=m1.get(t[0])*m1.get(t[1]);
                m1.put(t[0],0);
                m1.put(t[1],0);
                while(k!=0){
                    l1.add(t);
                    k--;
                }
            }
            else if(arr[i]+arr[j]>s) j--;
            else i++;
        }
        int[][] ans=new int[l1.size()][2];
        i=0;
        for(int[]a:l1){
            ans[i][0]=a[0];
            ans[i][1]=a[1];
            i++;
        }
        return ans;
    }
}