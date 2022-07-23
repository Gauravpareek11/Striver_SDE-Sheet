class Solution {

    public static int minCharsforPalindrome(String str) {
        //Write your code here
        StringBuilder sb=new StringBuilder(str);
        String s=str+'$'+sb.reverse().toString();
        int[] ans=lps(s);
        return str.length()-ans[ans.length-1];
    }
    static int[] lps(String s){
        int n=s.length();
        int[] lp=new int[n];
        for(int i=1;i<n;i++){
            int len=lp[i-1];
            while(len>0 && s.charAt(i)!=s.charAt(len)){
                len=lp[len-1];
            }
            if(s.charAt(i)==s.charAt(len)) len++;
            lp[i]=len;
        }
        return lp;
    }

}
