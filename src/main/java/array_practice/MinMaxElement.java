package array_practice;

import java.util.Scanner;

public class MinMaxElement {

    static class Pair{
        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n){
        Pair minmax = new Pair();
        int i;

        if(n==1){
            minmax.min = arr[0];
            minmax.max = arr[0];
        }
        if(arr[0] > arr[1]){
            minmax.min = arr[1];
            minmax.max = arr[0];
        }else if(arr[0] < arr[1]){
            minmax.min = arr[0];
            minmax.max = arr[1];
        }

        for(i=2; i<n; i++){
            if(arr[i]>minmax.max){
                minmax.max = arr[i];
            }else if(arr[i] < minmax.min){
                minmax.min = arr[i];
            }
        }
        return minmax;
    }

    public static void main(String[] args) {
        int n;
        Scanner in =new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        Pair minmax = getMinMax(arr, arr.length);
        System.out.println("Minimum element:" +minmax.min);
        System.out.println("Maximum element:" +minmax.max);
    }
}
