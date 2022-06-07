import java.util.* ;

class Interval{
    int start;
    int finish;

    Interval(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}
public class Merge_Intervals{
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        // write your code here.
        List<Interval>ans=new ArrayList<>();
//         for(Interval a:intervals){
//             System.out.println(a.start+" "+a.finish);
//         }
        Arrays.sort(intervals,(a,b)->Integer.compare(a.start,b.start));
        int end=intervals[0].finish;
        int start=intervals[0].start;
//         System.out.println(start+" "+end);
        for(int i=1;i<intervals.length;i++){
            if(end>=intervals[i].start){
                end=Math.max(end,intervals[i].finish);
            }
            else{
                ans.add(new Interval(start,end));
                start=intervals[i].start;
                end=intervals[i].finish;
            }
        }
        ans.add(new Interval(start,end));
        return ans;
    }
}