public class check_Permutation {
    public static boolean areAnagram(String str1, String str2){
        // Write your code here.
        int[] count=new int[26];
        for(char c:str1.toCharArray()){
            count[c-'a']++;
        }
        for(char c:str2.toCharArray()){
            count[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0) return false;
        }
        return true;
    }
}
