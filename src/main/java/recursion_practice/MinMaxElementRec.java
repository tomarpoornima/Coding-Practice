package recursion_practice;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxElementRec {

    /*public static int getMin(int[] arr, int n){
        if(arr == null){
            return 0;
        }
//        int min = Integer.MAX_VALUE;
          int min = arr[0];
        for (int i=1; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }else{
                min = getMin(arr, n-1);
            }
        }
        return min;
    }

    public static int getMax(int[] arr, int n){
        if(arr == null){
            return 0;
        }
//        int max = Integer.MIN_VALUE;
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }else{
                max = getMax(arr, n-1);
            }
        }
        return max;
    }*/

    /*public static int getMin(int[] arr, int n){
        return Arrays.stream(arr).min().getAsInt();
    }
    public static int getMax(int[] arr, int n){
        return Arrays.stream(arr).max().getAsInt();
    }
*/
    public static int getMin(int[] arr, int i, int n){
        return (n==1) ? arr[i] : Math.min(arr[i], getMin(arr, i+1, n-1));
    }
    public static int getMax(int[] arr, int i, int n){
        return (n==1) ? arr[i] : Math.max(arr[i], getMax(arr, i+1, n-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Min element: " + getMin(arr,0, n));
        System.out.println("max element: " + getMax(arr, 0, n));

        /*System.out.println(getMin(arr, n));
        System.out.println(getMax(arr, n));*/
    }
}
