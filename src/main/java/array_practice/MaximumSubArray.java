//https://www.enjoyalgorithms.com/blog/maximum-subarray-sum

package array_practice;

public class MaximumSubArray {

    public static int maxSubArray(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
    public static int maxSubArrayKA(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<n; i++){
            currSum = currSum + arr[i];
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        if(maxSum < 0) {
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }
    public static int maxSubArrayKA1(int[] arr, int n){
        if(n==0){
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int start = 0, end = 0, sTemp = 0;
        for(int i=0; i<n; i++){
            currSum = currSum + arr[i];
            if(currSum > maxSum){
                maxSum = currSum;
                start = sTemp;
                end = i;
            }
            if(currSum < 0){
                currSum = 0;
                sTemp = i+1;
            }
        }
        System.out.println("starting index: "+start+" and Ending index: "+end);
        System.out.println("subarray length:"+(end-start+1));
        for(int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return maxSum;
    }

    //by merge sort
    public static int maxCrossingSum(int[] arr, int l, int mid, int r){
        int sum = 0;
        int maxLeftSum = Integer.MIN_VALUE;
        for(int i=mid; i>l; i--){
            sum = sum + arr[i];
            if(maxLeftSum < sum){
                maxLeftSum = sum;
            }
        }
        sum =0;
        int maxRightSum = Integer.MIN_VALUE;
        for(int i = mid+1; i<=r; i++){
            sum = sum + arr[i];
            if(maxRightSum < sum){
                maxRightSum = sum;
            }
        }
        return (maxLeftSum+maxRightSum);
    }
    public static int findMaxSubarraySum(int[] arr, int l, int r){
        if(l == r){
            return arr[l];
        }
        else{
            int mid = l + (r-l)/2;
            int leftMaxSum = findMaxSubarraySum(arr, l, mid);
            int rightMaxSum = findMaxSubarraySum(arr, mid+1, r);
            int crossingMaxSum = maxCrossingSum(arr, l, mid, r);
            return Math.max(Math.max(leftMaxSum,rightMaxSum), crossingMaxSum);
        }
    }

    public static  int maxNonNegativeSubarray(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int start =0, end =0, s=0;
        for(int i=0; i<n; i++){
            if(arr[i] < 0) {
                s = i+1;
                currSum = 0;
            }else{
                currSum +=arr[i];
            }
            if(maxSum <currSum){
                maxSum = currSum;
                start = s;
                end = i;
            }
        }
        System.out.println("staring index: "+start+" and Ending index: "+end);
        System.out.println("subarray elements");
        for (int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        return maxSum;
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
        }
        return maxProfit;

    }

}
