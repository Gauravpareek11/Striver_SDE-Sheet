import java.util.* ;
public class Longest_consecutive_subsequence {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        HashSet<Integer>s1=new HashSet<>();
        for(int i:arr){
            s1.add(i);
        }
        int ans=1;
        for(int i:arr){
            if(!s1.contains(i-1)){
                int a=i;
                while(s1.contains(a)){
                    a++;
                }
                ans=Math.max(ans,a-i);
            }
        }
//         ans=Math.max(ans,k);
        return ans;
    }
}
