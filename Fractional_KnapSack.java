import java.util.*;


class Pair
{
    int weight;
    int value;
    Pair(int weight, int value)
    {
        this.weight = weight;
        this.value = value;
    }
    
}


public class Fractional_KnapSack {
    public static double maximumValue(Pair[] items, int n, int w) {
        // Write your code here.
        // ITEMS contains {weight, value} pairs.
    Arrays.sort(items,(a,b)->Double.compare((double)b.value/(double)b.weight,(double)a.value/(double)a.weight));
    double ans=0;
    for(int i=0;i    <n;i++){
        if(w<items[i].weight){
            ans+=((double)items[i].value/(double)items[i].weight)*w;
            w=0;
            break;
        }
        else{
            ans+=items[i].value;
            w-=items[i].weight;
        }
    }
    return ans;
}
}
