package binarysearch_practice;

import java.util.Scanner;

public class SearchInsertPosition {

    public static int searchInsert(int nums[], int target){   // time - O(logn), space - O(1)
        if(nums.length==0 || nums==null) return 0;

        int n = nums.length;
        int l=0, r=n-1;
        while(l < r){
            int m = l + (r-l)/2;
            if(nums[m]==target) return m;
            else if(nums[m] > target) r = m ;
            else l=m+1;
        }
        return nums[l] > target ? l+1 : l;
    }
    public static  int recursiveSearch(int nums[],int l, int r, int target){  // time - O(logn), space = O(logn)
        if(nums==null || nums.length==0)
            return 0;



        while(l<r){
            int m= l+(r-l)/2;
            if(nums[m]==target) return m;
            else if(nums[m] > target) return recursiveSearch(nums, l, m-1, target);
            else return recursiveSearch(nums, m+1, r, target);
        }

        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int l=0, r = n-1;
        System.out.println(searchInsert(nums, target));
        System.out.println(recursiveSearch(nums,l, r, target));
    }
}
