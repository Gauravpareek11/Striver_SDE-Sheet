import java.util.*;
class pair{
    int start;
    int end;
    int in;
    pair(int a,int b,int c){
        this.start=a;
        this.end=b;
        this.in=c;
    }
}
public class Maximum_meetings{
    public static List<Integer> maximumMeetings(int[] start, int[] end) {        
        //Write your code here
        pair[] a=new pair[start.length];
        for(int i=0;i<start.length;i++){
            a[i]=new pair(start[i],end[i],i+1);
        }
        Arrays.sort(a,(x,y)->Integer.compare(x.end,y.end));
        List<Integer>ans =new ArrayList<>();
        int s=-1;
        for(int i=0;i<a.length;i++){
            if(s<a[i].start){
                ans.add(a[i].in);
                s=a[i].end;
            }
        }
        return ans;
    }
}