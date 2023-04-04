package sorting_algorithims;

import java.util.Scanner;

public class QuickSort {

    public static int partition(int[] arr, int l, int r){
        int pivot = arr[r];
        int i = l - 1;
        for(int j=l; j<r; j++){
            if(arr[j] < pivot){
                 i = i+1;
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;

        return i+1;
    }
    public static void Sort(int[]arr, int l, int r){
        if(l<r){
            int pivotIndex = partition(arr, l, r);
            Sort(arr, l, pivotIndex-1);
            Sort(arr, pivotIndex+1, r);
        }
    }
    public static void printArray(int[] arr, int n){
        for(int i=0; i<n; i++){
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
        System.out.println("Before Sorting: ");
        printArray(arr, n);
        Sort(arr, 0, n-1);
        System.out.println();
        System.out.println("After sorting: ");
        printArray(arr, n);
    }

}

