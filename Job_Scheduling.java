import java.util.*;
public class Job_Scheduling {
    public static int jobScheduling(int[][] jobs)
    {
        Arrays.sort(jobs,(a,b)->Integer.compare(b[1],a[1]));
//         Arrays.sort(jobs,(a,b)->Integer.compare(a[0],b[0]));
        int max=0;
        int ans=0;
        for(int i=0;i<jobs.length;i++){
            max=Math.max(max,jobs[i][0]);
        }
        int[] filled=new int[max+1];
        Arrays.fill(filled,-1);
        for(int i=0;i<jobs.length;i++){
            for(int j=jobs[i][0];j>0;j--){
                if(filled[j]==-1){
                    filled[j]=0;
                    ans+=jobs[i][1];
                    break;
                }
            }
        }
//         System.out.println(ans);
        return ans;
    }
}
