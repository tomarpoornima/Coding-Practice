package array_practice;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZero {

    public static void moveZeroes(int[] nums){
        Arrays.sort(nums);

        for(int j=0; j<nums.length; j++){
            if(nums[j]=='0'){
                nums[j]=nums[nums.length-1];
            }
        }
        for (int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] =sc.nextInt();
        }
        moveZeroes(nums);

    }
}
