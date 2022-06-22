public class Reverse_String_Word {
    public static String reverseString(String str) 
	{
		//Write your code here
        String[] a=str.split(" ");
        StringBuilder ans=new StringBuilder("");
        for(int i=a.length-1;i>=0;i--){
            if(a[i].equals("")||a[i].equals(" ")) continue;
            else{
                ans.append(a[i]);
                if(i!=0) ans.append(" ");
            }
        }
        return ans.toString();
	}
}
