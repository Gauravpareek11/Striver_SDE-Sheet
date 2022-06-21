import java.util.*;
public class Valid_paranthesis {
    public static boolean isValidParenthesis(String s) {
        // Write your code here.
        Stack<Character>s1=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{' || c=='(' || c=='['){
                s1.add(c);
            }
            else{
                if(s1.isEmpty()) return false;
                if(c=='}'){
                    if(s1.peek()=='{') s1.pop();
                    else return false;
                }
                else if(c==']'){
                    if(s1.peek()=='[') s1.pop();
                    else return false;
                }
                else{
                    if(s1.peek()=='(') s1.pop();
                    else return false;
                }
            }
        }
        if(s1.isEmpty()) return true;
        else return false;
    }
}
