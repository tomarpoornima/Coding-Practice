package string_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {

    public static boolean areAnagramsUsingStream(String s1, String s2){
        if(s1.length() != s2.length())
            return false;

        s1 =s1.toLowerCase();
        s2 =s2.toLowerCase();

        s1 = s1.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        s2 = s2.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

        if(!(s1.equals(s2)))
            return false;

        return true;

    }
    public static boolean areAnagramsUsingArrays(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        s1 = s1.toLowerCase();
        s2 =s2.toLowerCase();

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        if(!(Arrays.equals(s1Array, s2Array)))
            return false;
      return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(areAnagramsUsingArrays(s1,s2) ? s1 +" and  "+ s2 +"are anagrams" : s1+" and "+ s2 +" are not anagrams");
        System.out.println(areAnagramsUsingStream(s1,s2)? s1 +" and  "+ s2 +"are anagrams" : s1+" and "+ s2 +" are not anagrams");
    }
}
