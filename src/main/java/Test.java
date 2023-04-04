import sorting_algorithims.LinkedListIS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.*;
import java.lang.*;



public class Test {

   public static int binarySearch(int[] arr, int l, int r, int key){

       if(r < l)
           return -1;

       int low = l;
       int high = r;

       int mid = low + (high - low)/2;

       if(key == arr[mid])
           return mid;
       if(key < arr[mid])
           return binarySearch(arr, low, mid, key);
       else
           return binarySearch(arr, mid+1, high, key);
   }
   public static int insertInSortedArray(int[] arr, int n, int key, int capacity){
       if(n >= capacity){
           return n;
       }

       int i;
       for(i = n-1; (i >= 0 && arr[i] > key ); i--){
           arr[i+1] = arr[i];
       }
       arr[i+1] = key;
       return n+1;
   }

   public static int deleteInArray(int[] arr, int n, int key){
       int pos = binarySearch(arr, 0 ,n, key);

       if(pos == -1){
           return n;
       }

       for(int i=pos; i < n-1; i++){
           arr[i] = arr[i+1];
       }
       return n-1;
   }

   public static void reverseArray(int[] arr, int n){
       int l = 0;
       int r = n-1;
       while(l < r){
           int temp = arr[l];
           arr[l] = arr[r];
           arr[r] = temp;
           l++;
           r--;
       }
   }
    public static void printArray(int[] arr, int n){
       for(int i=0; i<n; i++){
           System.out.print(arr[i]+" ");
       }
    }
    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;

        int key = 7;
        System.out.println(binarySearch(arr, 0, arr.length -1, key));

        int ele = 7;
        int capacity = arr.length;
        int total = 6;

        int n = insertInSortedArray(arr, total , ele, capacity);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int del = 4;
        int len = deleteInArray(arr, total, del);
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverseArray(arr, arr.length);

        printArray(arr, arr.length);
    }
}

