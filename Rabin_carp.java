import java.util.ArrayList;

public class Rabin_carp {
    public static ArrayList<Integer> stringMatch(String str, String pat) {
		// Write your code here.
        ArrayList<Integer>ans=new ArrayList<>();
        int d=256;
        int q=13;
        int h=1;
        for(int i=0;i<pat.length()-1;i++){
            h=(h*d)%q;
        }
        int p=0;
        int t=0;
        for(int i=0;i<pat.length();i++){
            p=(p*d+pat.charAt(i))%q;
            t=(t*d+str.charAt(i))%q;
        }
        for(int i=0;i<=str.length()-pat.length();i++){
            if(p==t){
                int count=0;
                for(int j=0;j<pat.length();j++){
                    if(str.charAt(i+j)==pat.charAt(j)) count++;
                }
                if(count==pat.length()) ans.add(i);
            }
            if(i<str.length()-pat.length()){
                t=(d*(t-str.charAt(i)*h)+str.charAt(i+pat.length()))%q;
                if(t<0){
                    t=t+q;
                }
            }
        }
        return ans;
	}
}
