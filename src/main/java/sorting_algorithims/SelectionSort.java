package sorting_algorithims;

import java.util.Scanner;

public class SelectionSort {

    public static void stableSelectionSort(int[] arr, int n){
        for (int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[min]> arr[j]){
                    min = j;
                }
            }
            int key = arr[min];
            while(min > i){
                arr[min] = arr[min-1];
                min--;
            }
            arr[i] = key;
        }
    }

    public static void selectionSort(int[] arr, int n){

        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i; j<n; j++){
                if(arr[j] > arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr, int n){
        for(int i=0; i<n; i++){
            System.out.print(i+": "+arr[i]+" ");
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
        printArray(arr,n);
        selectionSort(arr, n);
        System.out.println();
        System.out.println("After Sorting: ");
//        printArray(arr,n);
        System.out.println();
        stableSelectionSort(arr, n);
        printArray(arr,n);
    }

//    public static void selectionSort(String[] arr, int n){
//        for(int i=0; i<n-1; i++){
//            int minIdx = i;
//            String minstr = arr[i];
//            /*compareTo() will return a -ve value,
//            if string1 (arr[j]) is smaller than string2 (minStr)*/
//            // If arr[j] is smaller than minStr
//            for(int j=i+1; j<n; j++){
//                if(arr[j].compareTo(minstr) < 0){
//                    minstr = arr[j];
//                    minIdx = j;
//                }
//            }
//            // Swapping the minimum element
//            // found with the first element.
//            if(minIdx!=i){
//                String temp = arr[i];
//                arr[i] =arr[minIdx];
//                arr[minIdx] = temp;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String[] arr = new String[n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.next();
//        }
//        System.out.println("Before Sorting: ");
//        for(int i=0; i<n; i++){
//            System.out.println(i+": "+arr[i]);
//        }
//        selectionSort(arr,n);
//        System.out.println("After sorting: ");
//        for(int i=0; i<n; i++){
//            System.out.println(i+": "+arr[i]);
//        }
//    }
}
