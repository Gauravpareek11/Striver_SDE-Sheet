
public class word_break {
    public static Boolean wordBreak(String[] arr, int n, String target) {
        // Write your code here.
        return solve(arr,target);
    }
   static Boolean solve(String[] arr,String target){
       if(target.equals("")) return true;
//        if(ans.length()>target.length()) return false;
       for(String i:arr){
           if(target.indexOf(i)==0){
//                ans+=i;
               return solve(arr,target.substring(i.length()));
           }
       }
       return false;
   } 
}
