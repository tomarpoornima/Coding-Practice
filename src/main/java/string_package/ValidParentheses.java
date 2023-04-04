package string_package;
import java.util.*;

public class ValidParentheses {


    public static boolean isValid(String s){
         Deque<Character> stack = new LinkedList<>();
         for(int i=0; i<s.length(); i++){
             switch (s.charAt(i)){
                 case '(': stack.push('('); break;
                 case '{': stack.push('{'); break;
                 case '[': stack.push('[');break;
                 case ')':
                     if(stack.size()==0 || stack.pop()!='(')
                         return false;
                     break;
                 case '}':
                     if (stack.size()==0 || stack.pop()!='{')
                         return false;
                     break;
                 case ']':
                     if (stack.size()==0 || stack.pop()!='[')
                         return false;
                     break;
             }
         }

        /*if(s.length()%2!=0 || s.length()==0)
            return false;

        Deque<Character> stack = new ArrayDeque<Character>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }else if(stack.isEmpty() || Math.abs(c- stack.pop())>2){
                return false;
            }
        }*/

        /* char[] chars = s.toCharArray();
         Stack<Character> st = new Stack<Character>();

         for(char c : chars){
             if(c=='(' || c=='{' || c=='['){
                 st.push(c);
             }else{
                 if(st.isEmpty())
                     return false;
                 else{
                     char top = st.peek();
                     if(c==')' && top=='(' || c=='}' && top=='{' || c==']' && top=='[')
                         st.pop();
                     else
                         return false;
                 }
             }
         }*/
        return stack.isEmpty();
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();

        System.out.println(isValid(s));

    }
}
