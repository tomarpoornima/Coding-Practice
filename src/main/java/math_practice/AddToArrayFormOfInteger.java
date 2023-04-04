package math_practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddToArrayFormOfInteger {

    public static List<Integer> addToArrayForm(int[] num, int k){
        LinkedList<Integer> list = new LinkedList<>();
        int len = num.length-1;

        while(len >= 0 || k != 0){
            if(len >= 0){
                k += num[len];
                len--;
            }
            list.addFirst(k % 10);
            k /= 10;
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        int  k = sc.nextInt();
        List<Integer> list = addToArrayForm(num, k);
        for(Integer i : list){
            System.out.print(i+" ");
        }
    }
}

/**
 * COMPLEXITY
 *
 * Time: O(max(n, log10(k))), where n is the length of the array and log10(k) is the number of digits present in variable k.
 * Space: O(max(n, log10(k))), not an in-place as we need space equal to the given k or length of array, whichever is maximum between the two, to store the elements.
 * BASIC IDEA
 * Basic Idea behind this implementation is to add the num array element one by one with the k
 * eg:
 * num[] = {1, 2, 3} and k = 45;
 *
 * 1st Iteration:
 * k += num[len--] --> k = k + num[2] --> k = 45 + 3 --> k = 48
 * list.addFirst(k % 10) --> list.addFirst(48 % 10) --> list.addFirst(8) --> [8]
 * k /= 10 --> k = k / 10 --> 48 / 10 --> k = 4
 *
 * 2nd Iteration:
 * k += num[len--] --> k = k + num[1] --> k = 4 + 2 --> k = 6
 * list.addFirst(k % 10) --> list.addFirst(6 % 10) --> list.addFirst(6) --> [6, 8]
 * k /= 10 --> k = k / 10 --> 6 / 10 --> k = 0
 *
 *
 * 3rd Iteration:
 * k += num[len--] --> k = k + num[0] --> k = 0 + 1 --> k = 1
 * list.addFirst(k % 10) --> list.addFirst(1 % 10) --> list.addFirst(1) --> [1, 6, 8] <--- Desired Output
 * k /= 10 --> k = k / 10 --> 1 / 10 --> k = 0
 *
 * Here, the loop will be executed 3 times as (length of num) > (number of digits in k) i.e. O(max(n, log10(k))), where n is the length of the array and log10(k) is the number of digits
 *
 */
