package array_practice;

import java.util.Scanner;

public class ArrayProblems {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
//        reverseArrayIterative(arr, n);
//        printArray(arr,n);
        reverseArrayRecursive(arr,0,n-1);
        printArray(arr,n);
    }
    static void printArray(int arr[], int size)
    {
        for (int i=0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
//    public static void reverseArrayIterative(int arr[], int n){
//        int i=0, j=n-1;
//        while(i<j){
//            int temp = arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//    }
    public static void reverseArrayRecursive(int arr[], int s, int e){
        int temp;
        if(s>=e){
            return;
        }
        temp = arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        reverseArrayRecursive(arr, s+1, e-1);

    }

}
//time complexity - O(n)