package sorting_algorithims;

import java.util.Scanner;

public class BubbleSort {

/*unoptimized bubble sort*/
    /***
     * time complexity : O(n^2) in worst case
     * to sort in decreasing order just opposite the sign > to <
     */
    public static void bubbleSort(int arr[], int n){
        for(int i=0; i<n-2; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void recursiveBubbleSort(int[] arr, int n){
        if(n==1)
            return ;
        int count = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i] = temp;
                count = count + 1;
            }
            if(count == 0)
                return;
        recursiveBubbleSort(arr, n-1);
        }
    }
/*Optimized bubble sort*/
    /***
     * time complexity : O(n) in best case
     */
//    public static void bubbleSort(int arr[], int n){
//        for(int i=0; i<n; i++){
//            boolean elementSwapped = false;
//            for(int j=0; j<n-i-1; j++){
//                if(arr[j]> arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                    elementSwapped = true;
//                }
//            }
//            if(elementSwapped == false){
//                break;
//            }
//        }
//    }

    public static  void printArray(int arr[], int n){
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

        System.out.println("Before Sorting:");
        printArray(arr, n);
        bubbleSort(arr, n);
        System.out.println();
        System.out.println("After Sorting:");
        printArray(arr, n);
        System.out.println();
        recursiveBubbleSort(arr, n);
        printArray(arr, n);
    }
}
