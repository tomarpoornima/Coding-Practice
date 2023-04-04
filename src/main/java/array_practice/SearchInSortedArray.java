package array_practice;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class SearchInSortedArray {
    public static int search(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    //TC - O(logn) sc - O(1)
    public static int binarySearch(int[] nums, int target){
        int l =0, r = nums.length-1;

        while(l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] >= nums[l]){
                if(target >= nums[l] && target < nums[mid]){
                    r = mid -1;
                }else{
                    l = mid + 1;
                }
            }else{
                if(target > nums[mid] && target <= nums[r]){
                    l = mid + 1;
                }else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
    public static int binarySearchDuplicate(int[] nums, int key){
        int l=0, r=nums.length-1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(nums[mid] == key){
                return mid;
            }
            if(nums[mid] == nums[l] && nums[mid] == nums[r]){
                l++;
                r--;
            }
            if(nums[l]<= nums[mid]){
                if(key < nums[mid] && key >= nums[l]){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }else{
                if(key > nums[mid] && key <= nums[r]){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int targte = sc.nextInt();
        System.out.println(search(nums, targte));
        System.out.println(binarySearch(nums, targte));
        System.out.println(binarySearchDuplicate(nums, targte));
    }
}
