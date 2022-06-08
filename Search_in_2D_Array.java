import java.util.ArrayList;

public class Search_in_2D_Array {
    static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		for(ArrayList<Integer>l1:mat){
            if(l1.get(0)==target) return true;
            if(l1.get(l1.size()-1)==target) return true;
            if(l1.get(0)<target && l1.get(l1.size()-1)>target){
                boolean f=solve(l1,target);
                if(f) return true;
            }
        }
        return false;
	}
    static boolean solve(ArrayList<Integer>l1,int target){
        int low=0;
        int high=l1.size()-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(l1.get(mid)==target) return true;
            else if(l1.get(mid)<target){
                low=mid+1;
            }
            else high=mid-1;
        }
        return false;
    }
}
