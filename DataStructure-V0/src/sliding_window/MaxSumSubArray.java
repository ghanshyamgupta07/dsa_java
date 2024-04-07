package sliding_window;

public class MaxSumSubArray {
    public static void main(String[] args) {

        int [] arr = {2,6,1,8,4,5,1};
        System.out.println(maxSumSubArray(arr,3));
    }

    private static int maxSumSubArray(int[] nums,int K){
        int i=0; int j=0;
        int sum = 0; int max_sum = Integer.MIN_VALUE;

        while (j<nums.length){
            sum += nums[j]; // processing
            if(j-i+1 == K){ // reached window
                max_sum = Integer.max(max_sum,sum);
                sum = sum - nums[i++];
            }
            j++; // reached or not j will keep moving
        }
        return max_sum;
    }
}
