import java.util.ArrayList;
import java.util.Stack;
class pair{
    int price;
    int i;
    pair(int a,int b){
        this.price=a;
        this.i=b;
    }
}
public class Online_Stock_Span {
    public static ArrayList<Integer> findSpans(ArrayList<Integer> price) {
        // Write your code here.
        Stack<pair>s1=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<price.size();i++){
            if(s1.isEmpty() || s1.peek().price>price.get(i)){
                ans.add(1);
            }
            else
                {
                while(!s1.isEmpty() && s1.peek().price<=price.get(i)){
                    s1.pop();
                }
                if(s1.isEmpty()) ans.add(i+1);
                else ans.add(i-s1.peek().i);
            }
            s1.add(new pair(price.get(i),i));
        }
        return ans;
    }
}
