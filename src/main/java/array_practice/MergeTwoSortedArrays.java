package array_practice;

import java.util.Scanner;

public class MergeTwoSortedArrays {

    public static void merge(int[] n1, int m, int[] n2, int n){
        int p1=m-1, p2=n-1, r=m+n-1;
        while(p2>=0){
            if(p1>=0 && n1[p1] > n2[p2]){
                n1[r--]=n1[p1--];
            }else{
                n1[r--]=n2[p2--];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n=sc.nextInt();
        int[] n1 = new int[m+n];
        int[] n2 = new int[n];
        for(int i=0; i<m; i++){
            n1[i] = sc.nextInt();
        }
        for(int j=0; j<n; j++){
            n2[j] = sc.nextInt();
        }

        merge(n1, m, n2, n);
        for(int i=0; i<n1.length; i++){
            System.out.print(n1[i]+" ");
        }
    }
}
