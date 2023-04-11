package stack_practice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

    /*public static boolean isValid(String s){
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
    }*/

    /*public static boolean isValidByHashMap(String s){
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> st = new Stack<>();
        map.put(')', '(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
                continue;
            }
            if(st.size()==0 || map.get(s.charAt(i))!= st.pop()){
                return false;
            }
        }
        return st.isEmpty();
    }*/

    public static boolean isValidByHashMap(String s){
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> st = new Stack<>();
        map.put('(', ')');
        map.put('{','}');
        map.put('[',']');
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if (map.get(st.pop()).equals(c)) {
                    continue;
                } else {
                    return false;
                }
            }
        }
           return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
       // System.out.println(isValid(s));
        System.out.println(isValidByHashMap(s));
    }
}
