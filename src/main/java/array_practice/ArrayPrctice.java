package array_practice;

import java.util.Scanner;

public class ArrayPrctice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        boolean result = checkCircularlySorted(arr, n);
        if(result == true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    public static boolean checkCircularlySorted(int[] arr, int n){
        int count = 0;
        for(int i=1; i<n; i++){
            if(arr[i-1] < arr[i]){
                count++;
            }
        }
        if(count > 1){
            return false;
        }else{
            return true;
        }
    }


}
