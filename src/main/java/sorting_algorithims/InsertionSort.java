package sorting_algorithims;

import java.util.Scanner;

public class InsertionSort {

    public static void insertionSort(int[] arr, int n){
        for(int i=1; i<n; i++){
            int currValue = arr[i];
            int j= i-1;
            while (j >= 0 && arr[j] < currValue){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = currValue;
        }
    }
    public static void printArray(int[] arr, int n)
    {
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Before sorting:");
        printArray(arr, n);
        System.out.println();
        insertionSort(arr, n);
        System.out.println("After sorting:");
        printArray(arr, n);
    }
}
