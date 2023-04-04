package string_package;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonChars {

    public static String commonChar(String s1, String s2){
        if(s1.length() >0 && s2.length() > 0){
            List<Character> l1 = new ArrayList<>();
            List<Character> l2 = new ArrayList<>();

            for (int i=0; i<s1.length(); i++){
                l1.add(s1.charAt(i));
            }
            for(int j=0; j<s2.length(); j++){
                l2.add(s2.charAt(j));
            }
            l1.retainAll(l2);

            StringBuilder sb = new StringBuilder();

            for(Character c : l1){
                sb.append(c);
            }
            return sb.toString();
        }else {
            return "";
        }
    }
    public static String commonChars(String s1, String s2){

        StringBuilder commonChars = new StringBuilder();

        if(s1.length() >0 && s2.length() > 0){

            String toBeIterated = (s1.length() > s2.length() ? s2 : s1);

            String toBeChecked = toBeIterated.equals(s1) ? s2 : s1;

            System.out.println(toBeIterated);
            System.out.println(toBeChecked);

            for(int i=0; i<toBeIterated.length(); i++){

                if(toBeChecked.contains(Character.toString(toBeIterated.charAt(i)))){

                    commonChars.append(Character.toString(toBeIterated.charAt(i)));
                }
            }
            return commonChars.toString();
        }else {
            return "";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

//        System.out.println(commonChars(s1, s2));

        System.out.println(commonChar(s1, s2));

    }

}
