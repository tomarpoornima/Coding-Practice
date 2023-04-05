package array_practice;

import java.util.Arrays;

public class MinimizeMaximumOfArray {

    public static int minimizeArrayValue(int[] nums){
        int l=0, r = Arrays.stream(nums).max().getAsInt(), ans =0;
        while( l<=r){
            int mid = l + (r -l)/2;
            if(valid(nums, mid)){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }

    public static boolean valid(int[] nums, int mid){
        long sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum > (long)mid * (i+1)){
                return false;
            }
        }
        return true;
    }

    public static int minimizeArrayValueOptimal(int[] nums){
        long sum = 0, ans =0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            ans = Math.max(ans, (sum+i)/(i+1));
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        //int[] nums = {};
        //System.out.println(minimizeArrayValue(nums)); //exception java.util.NoSuchElementException: No value present
        int[] nums1 = {3,7,1,6};
        System.out.println(minimizeArrayValue(nums1));
        System.out.println(minimizeArrayValueOptimal(nums1));
        int[] nums2 = {10,1};
        System.out.println(minimizeArrayValue(nums2));
        System.out.println(minimizeArrayValueOptimal(nums2));

    }
}
