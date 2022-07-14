import java.util.*;
public class Count_distinct_element_in_every_k_size {
    public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

		// Write your code here
        ArrayList<Integer>ans=new ArrayList<>();
        HashMap<Integer,Integer>m1=new HashMap<>();
        for(int i=0;i<k;i++){
            m1.put(arr.get(i),m1.getOrDefault(arr.get(i),0)+1);
        }
        int i=0;
        int j=k;
        while(j<arr.size()){
//             System.out.println(m1);
            ans.add(m1.size());
            m1.put(arr.get(i),m1.get(arr.get(i))-1);
            if(m1.get(arr.get(i))==0) m1.remove(arr.get(i));
            m1.put(arr.get(j),m1.getOrDefault(arr.get(j),0)+1);
            i++;
            j++;
        }
//         m1.put(arr.get(i),m1.get(arr.get(i))-1);
//         if(m1.get(arr.get(i))==0) m1.remove(arr.get(i));
        ans.add(m1.size());
        return ans;
	}
}
