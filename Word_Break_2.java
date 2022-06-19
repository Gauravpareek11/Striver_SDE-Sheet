import java.util.ArrayList;
public class Word_Break_2 {
    public static ArrayList<String> wordBreak(String s, ArrayList<String> dictionary) {
		// Write your code here.
        ArrayList<String>l1=new ArrayList<>();
        solve(s,dictionary,0,"",l1);
        return l1;
	}
    static void solve(String s,ArrayList<String>dict,int i,String ans,ArrayList<String>l1){
        if(i>=s.length()){
            ans=ans.trim();
            l1.add(ans);
            return;
        }
        for(int k=i;k<s.length();k++){
            if(dict.contains(s.substring(i,k+1))){
                solve(s,dict,k+1,ans+" "+s.substring(i,k+1),l1);
            }
        }
    }
}
