public class implement_atoi {
    public static int atoi(String s) {
        // Write your code here.
        if(s.length()==0) return 0;
        int num=0;
        boolean negative=false;
        for(int i=0;i<s.length();i++){
            if(i==0 && s.charAt(i)=='-') negative=true;
            if(s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<=9){
                num=num*10;
                num+=s.charAt(i)-'0';
            }
        }
        if(negative) num=-num;
        return num;
    }
}
