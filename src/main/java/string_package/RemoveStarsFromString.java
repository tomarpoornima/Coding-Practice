package string_package;

import java.util.Scanner;

public class RemoveStarsFromString {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(removeStars(s));

    }
}
