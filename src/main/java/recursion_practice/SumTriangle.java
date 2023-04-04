package recursion_practice;

import java.util.Scanner;

public class SumTriangle {

    public static void printTriangle(int[] arr) {
        int n = arr.length;

        if (n < 1)
            return;

        int[] temp = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            int x = arr[i] + arr[i + 1];
            temp[i] = x;
        }

        printTriangle(temp);

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(arr[i] + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] input = new int[len];
        for(int i=0; i<len; i++){
            input[i] = sc.nextInt();
        }
        printTriangle(input);
    }

}
