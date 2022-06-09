import java.util.* ;
public class Find_Four_Elements_that_sum_to_a_given_value {
    public static String fourSum(int[] arr, int target, int n) {
        // Write your code here.
        Arrays.sort(arr);
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int l=j+1;
                int r=n-1;
  //               System.out.println(arr[i]+" "+arr[j]+" "+arr[l]+" "+arr[r]);
                while(l<r){
                    if(arr[i]+arr[j]+arr[l]+arr[r]==target){
                        return "Yes";
                    }
                    if(arr[i]+arr[j]+arr[l]+arr[r]>target)r--;
                    else l++;
                }
            }
        }
        return "No";
    }
}
