import java.util.*;
public class Roman_to_integer {
    public static int romanToInt(String s) {
        // Write your code here
        ArrayList<Integer>l1=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I') l1.add(1);
            if(s.charAt(i)=='V') l1.add(5);
            if(s.charAt(i)=='X') l1.add(10);
            if(s.charAt(i)=='L') l1.add(50);
            if(s.charAt(i)=='C') l1.add(100);
            if(s.charAt(i)=='D') l1.add(500);
            if(s.charAt(i)=='M') l1.add(1000);
        }
        int ans=0;
        int i=0;
        for(i=l1.size()-1;i>0;i--){
            if(l1.get(i)>l1.get(i-1)){
                ans+=l1.get(i)-l1.get(i-1);
                i--;
            }
            else{
                ans+=l1.get(i);
            }
        }
        if(i==0) ans+=l1.get(0);
        return ans;
    }
}
