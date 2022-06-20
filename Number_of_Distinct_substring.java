import java.util.*;
public class Number_of_Distinct_substring {
    public static int distinctSubstring(String word) {
        // Write your code here.
        HashSet<String>s1=new HashSet<>();
        for(int i=0;i<word.length();i++){
            for(int j=i+1;j<=word.length();j++){
                s1.add(word.substring(i,j));
            }
        }
        return s1.size();
    }
}
