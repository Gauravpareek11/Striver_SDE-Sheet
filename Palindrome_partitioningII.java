import java.util.*;
public class Palindrome_partitioningII {
    public static int palindromePartitioning(String str) {
	    // Write your code here
        HashMap<String,Integer>m1=new HashMap<>();
        return solve(str,m1)-1;
	}
    static int solve(String str,HashMap<String,Integer>m1){
        if(str.length()==0) return 0;
        if(m1.containsKey(str)) return m1.get(str);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=str.length();i++){
            if(isPalindrome(str.substring(0,i))){
                min=Math.min(1+solve(str.substring(i),m1),min);
            }
        }
        m1.put(str,min);
        return min;
    }
    static boolean isPalindrome(String s){
        if(s.length()==1) return true;
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    } 
}
