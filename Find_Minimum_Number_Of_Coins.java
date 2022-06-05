public class Find_Minimum_Number_Of_Coins {
    public static int findMinimumCoins(int amount)
    {
        int count=0;
    	int[] coins={1,2,5,10,20,50,100,500,1000};
    	while(amount!=0){
            for(int i=coins.length-1;i>=0;i--){
                if(coins[i]<=amount){
                    count++;
                    amount-=coins[i];
                    break;
                }
            }
        }
    return count;
    }
}
