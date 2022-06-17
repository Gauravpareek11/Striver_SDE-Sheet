import java.util.*;
public class Palindrome_Partitioning {
    public static List<List<String>> partition(String s) {
        // Write your code here.
        List<List<String>>ans=new ArrayList<>();
        List<String>l1=new ArrayList<>();
        HashMap<String,Boolean>m1=new HashMap<>();
        solve(0,s,l1,ans,m1);
        return ans;
    }
    static void solve(int i,String s,List<String>l1,List<List<String>>ans,HashMap<String,Boolean>m1){
        if(i==s.length()){
            ans.add(l1);
            return;
        }
        for(int k=i;k<s.length();k++){
            if(isPalindrome(s.substring(i,k+1),m1)){
                List<String>temp=new ArrayList<>(l1);
                temp.add(s.substring(i,k+1));
                solve(k+1,s,temp,ans,m1);
            }
        }
    }
    static boolean isPalindrome(String s,HashMap<String,Boolean>m1){
        if(m1.containsKey(s)) return m1.get(s);
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){ 
                m1.put(s,false);
                return false;
            }
            i++;
            j--;
        }
        m1.put(s,true);
        return true;
    }
}
