package array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromSortedArray {

    public static int removeDuplicates(int[] nums){


        //Here we declared a pointer to keep the track of previous index
        int previous = 0;

        for(int i = 1; i < nums.length; i++)
        {
            //Condition used - if the integer at i'th index is not equal to integer at previous'th index then the condition is satisfies i.e both the integer are different
            if(nums[i] != nums[previous])
            {
                //Incresing the previous by one to update its position by 1.
                previous++;

                //Inserting the value at i'th index to the previous'th index
                nums[previous] = nums[i];
            }
        }

        return previous+1;   //time - o(n), space - o(1)

        /*if(nums.length==0) return 0;
        int res=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[i-1]) {
                nums[res] = nums[i];
                res++;
            }
        }
        return res;*/

        /*int count=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1])
                count++;
            else
                nums[i-count]=nums[i];

        }
        return nums.length - count;*/

        /*if(nums.length ==0) return 0;           //using two pointer, time - o(n), space-O(1)
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[j]!=nums[i]) {            //i!=j increment i and copy value to nums[i+1]
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;*/
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
         Arrays.sort(nums);
        System.out.println(removeDuplicates(nums));
    }
}
