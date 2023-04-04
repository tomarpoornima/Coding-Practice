package array_practice;

import java.util.Scanner;

public class FindMinInSortedRotated {

    public static int findMin(int[] nums, int l, int r){
        if(nums[l] <= nums[r]){
            return nums[l];
        }
        while (l <= r){
            int mid = l + (r - l)/2;
            if (nums[mid] < nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid] > nums[r]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(findMin(nums, 0, n-1));
    }

}
