import java.util.* ;
public class Majority_Element {
    public static int findMajority(int[] arr, int n) {
		// Write your code here.
        HashMap<Integer,Integer>m1=new HashMap<>();
        for(int i:arr){
            if(m1.containsKey(i)){
                m1.put(i,m1.get(i)+1);
            }
            else m1.put(i,1);
        }
        for(int i:m1.keySet()){
            if(m1.get(i)>(int)Math.floor(n/2)) return i;
        }
        return -1;
	}
}
