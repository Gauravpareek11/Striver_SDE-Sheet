import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> maxXorQueries(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> queries) {
        // Write your code here.
        ArrayList<Integer>ans=new ArrayList<>();
        for(ArrayList<Integer>l1:queries){
            int x=l1.get(0);
            int y=l1.get(1);
            int max=-1;
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)<=y){
                    max=Math.max(max,x^arr.get(i));
                }
            }
            ans.add(max);
        }
        return ans;
    }
}
