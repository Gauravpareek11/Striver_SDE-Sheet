import java.util.ArrayList;
public class Single_Element_in_Sorted_Array {
    public static int uniqueElement(ArrayList<Integer> arr) 
    {
        //    Write your code here.
        int xor=0;
        for(int i:arr){
            xor^=i;
        }
        return xor;
    }
}
