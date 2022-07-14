import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;
public class nextPermutation {
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer>arr) 
	{
		int n = arr.size();
        int j=n-2, i;
        while(j>=0 && arr.get(j)>=arr.get(j+1)) j--;
        if(j>=0){
            i=n-1;
            while(i>j && arr.get(i)<=arr.get(j))i--;
            int temp = arr.get(i);
            int temp1=arr.get(j);
            arr.set(j,temp);
            arr.set(i,temp1);
        }
        j++;
        i=n-1;
        while(j<i){
            int temp = arr.get(i);
            int temp1=arr.get(j);
            arr.set(j,temp);
            arr.set(i,temp1);
            j++;
            i--;
        }
        return arr;
	}
}
