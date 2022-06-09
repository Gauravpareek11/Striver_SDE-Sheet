public class Longest_Substring_without_repeating_characters {
    public static int uniqueSubstrings(String s) 
    {
		//write your code here
        int[] a=new int[26];
        int i=0;
        int j=1;
        int max=1;
        a[s.charAt(i)-'a']++;
        while(j<s.length()){
            if(a[s.charAt(j)-'a']!=0){
                max=Math.max(max,j-i);
                while(s.charAt(i)!=s.charAt(j)){
                    a[s.charAt(i)-'a']--;
                    i++;
                }
                a[s.charAt(i)-'a']--;
                i++;
            }
            a[s.charAt(j)-'a']++;
            j++;
        }
        return Math.max(max,j-i);
	}
}
