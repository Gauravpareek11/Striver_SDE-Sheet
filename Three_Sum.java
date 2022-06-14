import java.util.* ;
public class Three_Sum {
    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {
        
	    // Write your code here.
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int l=i+1;
            int j=n-1;
            while(l<j){
                if(arr[i]+arr[l]+arr[j]==K){
                    ArrayList<Integer>l1=new ArrayList<>();
                    l1.add(arr[i]);
                    l1.add(arr[l]);
                    l1.add(arr[j]);
                    ans.add(l1);
                    int x=arr[l];
                    int y=arr[j];
                    while(l<j && arr[l]==x) l++;
                    while(l<j && arr[j]==y) j--;
                }
                else if(arr[i]+arr[l]+arr[j]<K) l++;
                else j--;
            }
            while(i+1<n && arr[i]==arr[i+1]) i++;
        }
        return ans;
	}
}
