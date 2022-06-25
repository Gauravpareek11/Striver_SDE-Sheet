public class compare_version_numbers {
    public static int compareVersions(String a, String b) 
    {
        // Write your code here
        String[] v1=a.split("[.]");
        String[] v2=b.split("[.]");
//         System.out.println(Arrays.toString(v1));
//         System.out.println(Arrays.toString(v2));
        for(int i=0;i<Math.min(v1.length,v2.length);i++){
            if(!v1[i].equals(v2[i])){
                if(v1[i].length()>v2[i].length()) return 1;
                else if(v2[i].length()>v1[i].length()) return -1;
                else{
                    for(int x=0;x<v1[i].length();x++){
                        if(v1[i].charAt(x)>v2[i].charAt(x)) return 1;
                        else if(v1[i].charAt(x)<v2[i].charAt(x)) return -1;
                    }
                }
            }
        }
        int j=0;
        if(v1.length>v2.length){
            for(j=v2.length;j<v1.length;j++){
                if(!v1[j].equals("0")) return 1;
            }
            return 0;
        }
        else if(v2.length>v1.length){
            for(j=v1.length;j<v2.length;j++){
                if(!v2[j].equals("0")) return -1;
            }
            return 0;
        }
        else return 0;
    }
}
