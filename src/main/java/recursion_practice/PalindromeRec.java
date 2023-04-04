package recursion_practice;

import java.util.Scanner;

public class PalindromeRec {

    public static int palindromCheck(int n, int rev){
       if(n==0) return rev;
       rev = rev *10 + n%10;
       return palindromCheck(n/10,rev);
    }

    public static boolean isPalindromCheck(int n){
        int res = palindromCheck(n, 0);
        return res == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPalindromCheck(n)){
            System.out.println("YEs");
        }else{
            System.out.println("No");
        }
    }
}
