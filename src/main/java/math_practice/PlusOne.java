package math_practice;

import java.util.Scanner;

public class PlusOne {


    public  static int[] plusOne(int[] digits){
        int carry = 1;
        for(int i=digits.length-1; i>=0; i--){
            digits[i] += carry;
            if(digits[i] <=9)
                return digits;
            digits[i]=0;
        }
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        return  newDigits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] digits = new int[n];
        for(int i=0; i<n; i++){
            digits[i] = sc.nextInt();
        }

        int[] newDigits = plusOne(digits);

        for(int i=0; i<newDigits.length; i++){
            System.out.print(newDigits[i]+" ");
        }
    }
}


/*
 public int[] plusOne(int[] digits) {
        int n = digits.length-1;
        while(n>=0){
            if(digits[n] == 9)
                digits[n] = 0;
            else{
                digits[n]+=1;
                return digits;
            }
            n--;
        }
        int[] newdigits = new int[digits.length+1];
        newdigits[0] = 1;
        return newdigits;
    }

 */

/*
  public int[] plusOne(int[] digits) {
        int len = digits.length; // length of array;

        // start the loop from last index;
        for (int i = len-1; i>=0; i--) {
            // if ith index is 9, that means there will be an overflow if we add 1
            // adding 1 will make it 10, so we set it to 0. and continue the loop;
            if (digits[i] == 9) {
                digits[i] = 0;
            }else {
                // if ith value is not 9 we just add 1 to it and return;
                digits[i] += 1;
                return digits;
            }
        }

        // if we are here, that means all the value of the array were 9;
        // and they are 0 now;
        // example: [9,9,9,9], after loop becomes [0,0,0,0];
        // so we have to create a new array of +1 length of the previous.
        // and place 1 at 0th index;
        int[] arr = new int[len+1];
        arr[0] = 1;
        return arr;
    }

 */

/*
 public int[] plusOne(int[] digits) {

    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }

        digits[i] = 0;
    }

    int[] newNumber = new int [n+1];
    newNumber[0] = 1;

    return newNumber;
}
 */