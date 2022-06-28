import java.util.*;
public class Maximum_activities {
        public static int maximumActivities(List<Integer> start, List<Integer> end) {
            //Write your code here
            int[][] a=new int[start.size()][2];
            for(int i=0;i<start.size();i++){
                a[i][0]=start.get(i);
                a[i][1]=end.get(i);
            }
            Arrays.sort(a,(x,y)->(x[1]-y[1]));
            int count=1;
            int s=a[0][1];
            for(int i=1;i<a.length;i++){
                if(a[i][0]>=s){
                    count++;
                    s=a[i][1];
                }
            }
            return count;
            
    }
}
