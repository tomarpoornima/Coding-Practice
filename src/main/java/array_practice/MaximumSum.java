package array_practice;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumSum {
    //tc - O(k*n) sc - O(1)
    public static int maximumSum(int[] arr, int k){
        for(int i=1; i<=k; i++){
            int min = Integer.MAX_VALUE;
            int index = -1;

            for (int j=0; j<arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            if(min == 0){
                break;
            }
            arr[index] = -arr[index];
        }
        int sum =0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    //tc - O(nlogn) sc -O(1)
    public static int maximumSumBySort(int[] arr, int k){
        Arrays.sort(arr);
        int sum =0;
        int i=0;
        while (k < 0){
            if(arr[i] >= 0)
                k = 0;
            else{
                arr[i] = (-1)*arr[i];
                k--;
            }
            i++;
        }
        for (int j=0; j<arr.length; j++){
            sum += arr[j];
        }
        return sum;
    }
    //tc-O(nlogn) sc -O(n)
    public static int maximumSumByPriorityQueue(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : arr){
            pq.add(i);
        }
        while (k-- > 0){
            int temp = pq.poll();
            temp *= -1;
            pq.add(temp);
        }
        int sum =0;
        for (int x : pq){
            sum += x;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {-2, 0, 5, -1, 2 };
        int k =4;
        System.out.println(maximumSum(arr, k));
        System.out.println(maximumSumBySort(arr, k));
        System.out.println(maximumSumByPriorityQueue(arr, k));
    }
}
