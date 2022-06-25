public class count_and_say {
    public static String writeAsYouSpeak(int n) 
    {
        // Write your code here.
        StringBuilder s=new StringBuilder("1");
        while(n-->1){
            StringBuilder temp=new StringBuilder("");
            int count=1;
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)) count++;
                else{
                    temp.append(Integer.toString(count));
                    temp.append(s.charAt(i));
                    count=1;
                }
            }
            temp.append(Integer.toString(count));
            temp.append(s.charAt(s.length()-1));
            s=temp;
        }
        return s.toString();
    }
}
