import java.util.*;
public class Largest_Rectangle_in_Histogram {
    public static int largestRectangle(ArrayList < Integer > heights) {
        // Write your code here.
          int[] ns=new int[heights.size()];
          int ps[]=new int[ns.length];
          Arrays.fill(ns,ns.length);
          Arrays.fill(ps,-1);
          Stack<Integer>s1=new Stack<>(); 
          for(int i=0;i<heights.size();i++){
              while(!s1.isEmpty() && heights.get(s1.peek())>=heights.get(i)){
                  s1.pop();
              }
              if(!s1.isEmpty()) ps[i]=s1.peek();
              s1.add(i);
          }
          s1.clear();
          for(int i=heights.size()-1;i>=0;i--){
              while(!s1.isEmpty() && heights.get(s1.peek())>=heights.get(i)){
                  s1.pop();
              }
              if(!s1.isEmpty()) ns[i]=s1.peek();
              s1.add(i);
          }
          int max=0;
          for(int i=0;i<heights.size();i++){
              max=Math.max(max,(ns[i]-ps[i]-1)*heights.get(i));
          }
          return max;
      }
}
