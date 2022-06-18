import java.util.*;

public class Matrix_Median {
    public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		// Write your code here.
//         ArrayList<Integer>l1=new ArrayList<>();
//         for(ArrayList<Integer>l2:matrix){
//             for(int i:l2){
//                 l1.add(i);
//             }
//         }
//         Collections.sort(l1);
//         if(l1.size()%2==0){
//             return (l1.get(l1.size()/2)+l1.get(l1.size()/2+1))/2;
//         }
//         return l1.get(l1.size()/2);
        int n=matrix.size();
        int m=matrix.get(0).size();
        int low=0;
        int high=(int)1e9;
        while(low<=high){
            int mid=low+(high-low)/2;
            int k=solve(matrix,mid);
            if(k<=(n*m)/2){
                low=mid+1;
            }
            else high=mid-1;
        }
        return low;
	}
    static int solve(ArrayList<ArrayList<Integer>>matrix,int a){
        int ans=0;
        for(List<Integer>l1:matrix){
            if(l1.get(0)>a) continue;
            int low=0;
            int high=l1.size()-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(l1.get(mid)<=a) low=mid+1;
                else high=mid-1;
            }
            ans+=low;
//             if(l1.get(low)<=a) ans++;
        }
        return ans;
    }
}
