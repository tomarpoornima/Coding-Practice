package array_practice;

public class ArrayTest {
    public static void main(String[] args){
        //int[] arr = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        //System.out.println(OddOccurence.getOddOccurence(arr, arr.length));
        //System.out.println(OddOccurence.getOddOccurenceHashMap(arr, arr.length));
        //System.out.println(OddOccurence.getOddOccurenceXOR(arr, arr.length));

       // int[] arr1 = {};
        //System.out.println(OddOccurence.getOddOccurence(arr1, arr1.length));
        //System.out.println(OddOccurence.getOddOccurenceHashMap(arr1, arr1.length));
        //System.out.println(OddOccurence.getOddOccurenceXOR(arr1, arr1.length));

       /* int[] nums = {-5,4,-1,7,8};
        System.out.println("Maximum sub array: "+MaximumSubArray.maxSubArrayKA1(nums, nums.length));
        int[] nums1 = {1};
        System.out.println("Maximum sub array: "+MaximumSubArray.maxSubArrayKA1(nums1, nums1.length));
        int[] nums2 = {-2,1,-1,4};
        System.out.println("Maximum sub array: "+MaximumSubArray.maxSubArrayKA1(nums2, nums2.length));
        int[] nums3 = {};
        System.out.println("Maximum sub array: "+MaximumSubArray.maxSubArrayKA1(nums3, nums3.length));
*/
        /* int[] nums = {-5,4,-1,7,8};
        System.out.println("Maximum sub array: "+MaximumSubArray.findMaxSubarraySum(nums, 0, nums.length-1));
        int[] nums1 = {1};
        System.out.println("Maximum sub array: "+MaximumSubArray.findMaxSubarraySum(nums1, 0, nums1.length-1));
        int[] nums2 = {-2,1,-3,4};
        System.out.println("Maximum sub array: "+MaximumSubArray.findMaxSubarraySum(nums2, 0, nums2.length-1));
        //int[] nums3 = {};
        //System.out.println("Maximum sub array: "+MaximumSubArray.findMaxSubarraySum(nums3, 0, nums3.length-1));
*/

        /*int[] arr = { 1, 4, -3, 9, 5, -6 };
        System.out.println("Maximum sub array: "+MaximumSubArray.maxNonNegativeSubarray(arr, arr.length));
        int[] arr1 = {1};
        System.out.println("Maximum sub array: "+MaximumSubArray.maxNonNegativeSubarray(arr1, arr1.length));
        int[] arr2 = {-2,1,-1,4};
        System.out.println("Maximum sub array: "+MaximumSubArray.maxNonNegativeSubarray(arr2, arr2.length));
        int[] arr3 = {12, 0, 10, 3, 11} ;
        System.out.println("Maximum sub array: "+MaximumSubArray.maxNonNegativeSubarray(arr3, arr3.length));
*/
        int[] arr = { 1, 4, 3, 9, 5, 6 };
        System.out.println("Maximum Profit: "+MaximumSubArray.maxProfit(arr));
        int[] arr1 = {1};
        System.out.println("Maximum Profit: "+MaximumSubArray.maxProfit(arr1));
        int[] arr2 = {2,1,1,4};
        System.out.println("Maximum Profit: "+MaximumSubArray.maxProfit(arr2));
        int[] arr3 = {12, 0, 10, 3, 11} ;
        System.out.println("Maximum Profit: "+MaximumSubArray.maxProfit(arr3));
    }
}
