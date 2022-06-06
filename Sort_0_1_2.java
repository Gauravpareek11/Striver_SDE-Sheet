public class Sort_0_1_2 {
    public static void sort012(int[] arr)
    {
        int zeros=0;
        int one=0;
        int two=0;
        for(int i:arr){
            if(i==0) zeros++;
            else if(i==1) one++;
            else two++;
        }
        for(int i=0;i<zeros;i++){
            arr[i]=0;
        }
        for(int i=0;i<one;i++){
            arr[zeros+i]=1;
        }
        for(int i=0;i<two;i++){
            arr[zeros+one+i]=2;
        }
    }
}
