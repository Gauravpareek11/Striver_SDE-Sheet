import java.util.* ;
import java.util.ArrayList;
public class Majority_Element_2 {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        HashMap<Integer,Integer>m1=new HashMap<>();
        for(int i:arr){
            if(m1.containsKey(i)){
                m1.put(i,m1.get(i)+1);
            }
            else m1.put(i,1);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i:m1.keySet()){
            if(m1.get(i)>(int)Math.floor(arr.size()/3)) ans.add(i);
        }
        return ans;
    }
}
