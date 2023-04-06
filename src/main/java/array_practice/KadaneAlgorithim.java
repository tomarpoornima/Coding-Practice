package array_practice;

public class KadaneAlgorithim {

    public static int maximumSumSubarray(int[] nums, int n){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int start=0,end =0;
        for(int i=0; i<n; i++){
            currSum = currSum + nums[i];
            if(maxSum < currSum){
                maxSum = currSum;
                end = i;
            }
            if(currSum < 0){
                currSum = 0;
                start = i+1;
            }
        }
        System.out.println(start+" "+end);
        for(int i=start; i<=end; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        return maxSum;
    }
    public static int maximumProductSubArray(int[] nums, int n){


        return 0;
    }

    public static void main(String[] args) {
        int[] nums = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(maximumSumSubarray(nums, nums.length));
    }
}
