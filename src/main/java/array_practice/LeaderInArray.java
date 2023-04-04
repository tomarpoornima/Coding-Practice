package array_practice;

import java.util.*;

public class LeaderInArray {

  /*  public static void printLeader(int[] arr, int n){
        for (int i=0; i<n; i++){
            int j;
            for(j = i+1; j<n; j++){
                if(arr[i] <= arr[j]){
                    break;
                }
            }
            if(j == n){
                System.out.print(arr[i]+" ");
            }
        }
    } time complexity - O(n2)*/

   /* public static void printLeader(int[] arr, int n){
        int maxElement = arr[n-1];
        System.out.print(maxElement+" ");

        for(int i= n-2; i>=0; i--){
            if(arr[i] > maxElement){
                maxElement = arr[i];
                System.out.print(maxElement+" ");
            }
        }
    }time complexity - O(n)*/

   public static void printLeader(int[] arr, int n){

       Stack<Integer> st = new Stack<>();
       st.push(arr[n-1]);

       for(int i=n-2; i>=0; i--){
           if(arr[i] > st.peek()){
               st.push(arr[i]);
           }
       }
       while(!st.empty()){
           System.out.print(st.pop()+" ");
       }
   }
//time - O(n) space - O(n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        printLeader(arr, n);
    }
}
