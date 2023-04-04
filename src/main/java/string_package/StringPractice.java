package string_package;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringPractice {

    //to swap first and last character
    public String swapFirstLastChar(String s){
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            int k=i;
            while (i<arr.length && arr[i]!= ' ') {
                i++;
            }
            char temp = arr[k];
            arr[k]=arr[i-1];
            arr[i-1]=temp;
        }
        return new String(arr);
    }


     //remove vowels from string
      public String removeVowels(String s){

        // usign replaceAll method
        //  return s.replaceAll("[aeiouAEIOU]", "");

        //using hashset
          Set<Character> vowelChr = new HashSet<Character>();
          vowelChr.add('A');
          vowelChr.add('E');
          vowelChr.add('I');
          vowelChr.add('O');
          vowelChr.add('U');
          vowelChr.add('a');
          vowelChr.add('e');
          vowelChr.add('i');
          vowelChr.add('o');
          vowelChr.add('u');

          StringBuffer str = new StringBuffer();
          char[] arr = s.toCharArray();
          for (Character ch:arr){
              if(!vowelChr.contains(ch))
                  str.append(ch);
          }
              //return new String(str);

          return str.toString();

         //brute force approach
         /* String s1 = "";
          for(int i=0; i<s.length(); i++){
              if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
                  continue;
              }else{
                  s1 += s.charAt(i);
              }
          }
          return s1;*/
      }

      public String defangIPaddr(String address){
         StringBuffer sb = new StringBuffer();
         int l=address.length();
         for(int i=0; i<l; i++) {
             char ch = address.charAt(i);
             if(ch == '.')
                 sb.append("[.]");
             else
                 sb.append(ch);
         }
         return sb.toString();
      }

      public int finalValueAfterOperations(String[] operations){
         int x=0;
         for (int i=0; i<operations.length; i++){
             if(operations[i].charAt(1) == '+')
                 x++;
             else
                 x--;
         }
         /*for(String s : operations){
             if(s.equals("X++") || s.equals("++X")){
                 x++;
             }else{
                 x--;
             }
         }
         /*for(int i=0; i<operations.length; i++){  //brute force failed some test cases
             if(operations[i]== "X++"){
                 x += 1;
             }else if(operations[i]== "++X"){
                 x+=1;
             }else if(operations[i]== "--X"){
                 x-=1;
             }else if(operations[i]== "X--") {
                 x -= 1;
             }
         }*/
        return x;
      }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringPractice obj = new StringPractice();
        System.out.println(obj.swapFirstLastChar(s));

        System.out.println(obj.removeVowels(s));

        String address = "1.1.1.1";
        System.out.println(obj.defangIPaddr(address));

        //String[] operations = new String[]{"X++","++X","--X","X--"};
        String[] operations = {"--X","X++","X++"};
        System.out.println(obj.finalValueAfterOperations(operations));
    }


}
