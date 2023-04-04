package recursion_practice;

import javax.xml.soap.SAAJResult;
import java.util.Scanner;

public class StringCopy {

    public static void copyString(char[] s1, char[] s2, int i){

        s2[i] = s1[i];
        if(i == s1.length -1){
            return;
        }
        copyString(s1, s2, i+1);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        char[] arr = s1.toCharArray();
        char[] arr2 = new char[arr.length];

        int i = 0;
        copyString(arr ,arr2, i);
        System.out.println(String.valueOf(arr2));

    }
}
