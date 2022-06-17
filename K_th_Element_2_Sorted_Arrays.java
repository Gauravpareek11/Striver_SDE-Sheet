public class K_th_Element_2_Sorted_Arrays {
    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        // Write your code here.
        int x=0;
//         int ans=0;
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(row1[i]<row2[j]){
                i++;
                x++;
                if(x==k) return row1[i-1];
            }
            else{
                j++;
                x++;
                if(x==k) return row2[j-1];
            }
        }
        while(i<m){
             i++;
             x++;
             if(x==k) return row1[i-1];
        }
        while(j<n){
           j++;
           x++;
           if(x==k) return row2[j-1];
        }
        return -1;
    }
}
