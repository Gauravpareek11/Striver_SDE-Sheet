import java.util.*;

public class Count_Subarrays_with_Given_XOR {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		HashMap<Integer,Integer>m1=new HashMap<>();
        int ans=0;
        int xor=0;
        for(int i=0;i<arr.size();i++){
            xor^=arr.get(i);
            if(xor==x) ans++;
            if(m1.containsKey(xor^x)) ans+=m1.get(xor^x);
            if(m1.containsKey(xor)) m1.put(xor,m1.get(xor)+1);
            else m1.put(xor,1);
        }
        return ans;
	}
}