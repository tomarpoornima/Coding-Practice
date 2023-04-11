package string_package;

import java.util.Scanner;

public class RemoveStarsFromString {

    //TC - O(n), sc - O(n) using string
    public static String removeStars(String s){
        StringBuilder  ans = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='*'){
                ans.deleteCharAt(ans.length()-1);
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }

    //using two pointer tc- O(n), sc - O(n)
    public static String removeStars1(String s){
        char[] chars = new char[s.length()];
        int j=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c == '*') {
                j--;
            }else{
                chars[j++] = c;
            }
        }

        StringBuilder ans = new StringBuilder();
        for(int i=0; i<j; i++){
            ans.append(chars[i]);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(removeStars(s));
        System.out.println(removeStars1(s));

    }
}
