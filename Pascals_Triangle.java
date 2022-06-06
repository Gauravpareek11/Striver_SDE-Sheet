 import java.util.ArrayList;

public class Pascals_Triangle {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<Long>());
        }
        for(int i=0;i<n;i++){
            if(i==0) ans.get(i).add(1L);
            else{
                for(int j=0;j<=i;j++){
                    if(j==0 || j==i) ans.get(i).add(1L);
                    else{
                        long a=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                        ans.get(i).add(a);
                    }
                }
            }
        }
        return ans;
	}
}
