import java.util.*;
public class Complete_String {
    public static String completeString(int n, String[] a) {
        // Write your code here.
          ArrayList<String>l1=new ArrayList<>();
          Arrays.sort(a);
          for(String i:a){
              l1.add(i);
          }
          int max=0;
          String ans="None";
           for(String s:a){
               boolean f=true;
               for(int j=1;j<=s.length();j++){
                   if(!l1.contains(s.substring(0,j))){
                       f=false;
                       break;
                   }
               }
               if(f){
                   if(max<s.length()){
                       max=s.length();
                       ans=s;
                   }
               }
           }
          return ans;
        }
}
