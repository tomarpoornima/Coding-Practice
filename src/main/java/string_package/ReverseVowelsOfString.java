package string_package;
import java.util.Scanner;

public class ReverseVowelsOfString {

    boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                c=='A' ||c=='E' || c=='I' || c=='O' || c=='U';
    }

    void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public  String reverseVowels(String s){
        int i=0;
        int j=s.length()-1;
        char[] sChar = s.toCharArray();

        while(i<j){
            if(!isVowel(sChar[i])){
                i++;
            }
             if(!isVowel(sChar[j])){
                j--;
            }
            if(i<j){
                swap(sChar, i++, j--);
            }
        }
        String s1 = new String(sChar);
//        return new String(sChar);
        return  s1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ReverseVowelsOfString obj1 = new ReverseVowelsOfString();
        System.out.println(obj1.reverseVowels(s));

    }

}
//-------------------------------------------------------------------------------------

/*
*
*  public String reverseVowels(String s) {
        if(s == null || s.length() < 2) return s;
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;
        Set<Character> vowels = new HashSet<>();  //using hashset
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        while(left < right){
            if(!vowels.contains(ch[left])) left++;
            else if(!vowels.contains(ch[right])) right--;
            else{ //(left < right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(ch);
    }
* */

/*
*  public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int i=0, j=ch.length-1;
        char temp;

        while(i<j){
            if(!vowels.contains(ch[i]+"")) i++;
            else if(!vowels.contains(ch[j]+"")) j--;
            else{
                temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                i++; j--;
            }
        }
        return String.valueOf(ch);
    }
* */