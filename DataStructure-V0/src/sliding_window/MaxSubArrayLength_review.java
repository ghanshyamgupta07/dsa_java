package sliding_window;

public class MaxSubArrayLength_review {
    public static void main(String[] args) {

        int [] arr = {2,6,1,1,4,2,5,1};
        System.out.println(maxSubArrayLength(arr,6));
    }

    private static int maxSubArrayLength(int[] nums,int target){

        int i=0; int j=0;
        int sum = 0; int  max_length = 0;
        int start = -1; int end = -1;

        while (j<nums.length){
            sum += nums[j]; // processing

            // reached window size or sum exceed so keep increasing window
            if(sum>=target) {
                if(sum == target){ // reached window
                    if(j-i>max_length){
                        max_length = j-i+1;
                        start = i;
                        end = j ;
                    }
                }
                // shift window in case reached or sum > target
                sum = sum - nums[i++];
            }
            j++;  // reached or not keep moving j
        }
        System.out.println(" index are " + start + " "+end);
        return max_length;
    }
}
