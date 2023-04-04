package array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

    public static int removeElement(int nums[], int val){
        int i=0; int n=nums.length;    // using two pointers, when elements are rare to remove, nums[1,2,3,4,5], val =5 or nums[4,1,2,3,5] val= 4
        while(i<n){
            if(nums[i]==val){
                nums[i]=nums[n-1]; //if nums[i]==val then swap the current elements to the last element
                n--;                //and it reduces size by 1
            }else{
                i++;
            }
        }
        return n;




        /* int i=0;
         for(int j=0; j<nums.length; j++){   //using two pointers, here i and j makes 2n steps so it takes o(n) time and o(1) space also make unneccessary copy operations
             if(nums[j]!=val){
                 nums[i]=nums[j];
                 i++;
             }
         }
            return  i;*/

        /*for(int i=0; i<nums.length; i++){   //brute force bad sol
            if(nums[i]==val){
                nums[i]='-';
            }
        }

        Arrays.sort(nums);
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!='-')
                k++;
        }
        return k;*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int val = sc.nextInt();

        System.out.println(removeElement(nums, val));
    }
}
