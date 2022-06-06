import java.util.ArrayList;

public class BestTime_to_Buy_and_Sell_Stock {
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int ans=0;
        int[] max=new int[prices.size()];
        int m=0;
        for(int i=prices.size()-1;i>=0;i--){
            m=Math.max(m,prices.get(i));
            max[i]=m;
        }
        for(int i=0;i<prices.size();i++){
            ans=Math.max(ans,max[i]-prices.get(i));
        }
        return ans;
    }
}
