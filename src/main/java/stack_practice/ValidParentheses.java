package stack_practice;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s){
        char[] chars = s.toCharArray();
        Stack<Character> st = new Stack<>();

        for(char c: chars){
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }else{
                if(st.isEmpty()){
                    return false;
                }else{
                    char ch = st.peek();
                    if(c == ')' && ch == '(' || c == ']' && ch == '[' || c == '}' && ch == '{'){
                        st.pop();
                    }else{
                        return false;
                    }

                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isValid(s));
    }
}
