package array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class PairSumInArray {

    /*public static boolean checkSumPair(int[] arr, int n, int sum){

            for (int i=0; i<(n - 1); i++) {
                for (int j=(i + 1); j<n; j++) {
                    if (arr[i] + arr[j] == sum) {
                        return true;
                    }
                }
            }
            return false;
    }time - O(N2)*/
   /* public static boolean checkSumPair(int[] arr, int n, int sum) {
        int l, r;
        Arrays.sort(arr);

        l = 0;
        r = n-1;

        while(l < r){
            if(arr[l] + arr[r] == sum){
                return true;
            }else if(arr[l] + arr[r] < sum){
                l++;
            }else{
                r--;
            }
        }
    return false;
    }time - O(NlogN) for sorting the array*/
    public static boolean checkSumPair(int[] arr, int n, int sum){

        return false;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        if(checkSumPair(arr, n , sum)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
