package array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class MarsStone {

    public static int stoneCount(int m, int n, int arr[]){
        int count = 0;
        int sum = 0;

        int arr1[] = new int[m];
        int arr2[] = new int[m-n];

        for(int i=0; i<m; i++){
            arr1[i] = i+1;
        }
        System.out.println(Arrays.toString(arr1));

        int k = 0;
        int counter;

        for(int i=0; i<arr1.length; i++){
            counter = 0;
            for(int j=0; j<arr.length; j++){
                if(arr1[i] == arr[j]){
                    break;
                }else{
                    counter++;
                }
            }
            if(counter > n){
                arr2[k] = arr1[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr2));

        for(int i=0; i<arr2.length; i++){
            if(sum + arr2[i] <= m){
                sum = sum + arr2[i];
                count++;
            }else{
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(stoneCount(m,n,arr));
    }
}
