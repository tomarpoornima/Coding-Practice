package string_package;

import java.util.Scanner;

public class ReverseString {

    public static void reverseString(String str){
        char[] s = str.toCharArray();
        int i=0;
        int j=s.length-1;
        while(i<=j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();

//        for(int i=0; i<arr.length; i++){
//            arr[i] = s.charAt(i);
//        }

        reverseString(s);
    }
}
