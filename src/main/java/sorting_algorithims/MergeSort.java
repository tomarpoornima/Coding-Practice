package sorting_algorithims;

import java.util.Scanner;

public class MergeSort {

    public static void merge(int[] arr, int l, int mid, int r){
        int n1 = mid -l + 1;
        int n2 = r - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0; i<n1; i++){
            L[i] = arr[l+i];
        }
        for(int j=0; j<n2; j++){
            R[j] = arr[mid + 1 + j];
        }
        int i=0, j=0, k=l;
        while(i < n1 && j <n2){
            if(L[i] < R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] arr, int l, int r){
        if(l < r){
            int mid = l + (r - l)/2;
            sort(arr, l, mid);
            sort(arr, mid+1, r);
            merge(arr, l, mid, r);
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
        printArray(arr,n);
        sort(arr, 0, arr.length-1);
        System.out.println();
        System.out.println("After sorting: ");
        printArray(arr, n);
    }


}
