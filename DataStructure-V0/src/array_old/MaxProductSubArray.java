package array_old;

public class MaxProductSubArray {


    public static void main(String[] args) {

        int [] arr = {-1,2,-3};
        System.out.println(maxProductSubarray(arr));

    }


    private static int maxProductSubarray(int [] nums){

        int min_prod_so_far = nums[0];
        int max_prod_so_far = nums[0];
        int max_prod = nums[0];

        int tmp_min;
        int tmp_max;

        for(int i=1;i<nums.length;i++){

            tmp_min = min_prod_so_far;
            tmp_max = max_prod_so_far;

            min_prod_so_far  = Math.min(nums[i],Math.min(
                    nums[i]*tmp_min,nums[i]*tmp_max
            ));
            max_prod_so_far  = Math.max(nums[i],Math.max(
                    nums[i]*tmp_min,nums[i]*tmp_max
            ));

            max_prod = Math.max(max_prod,max_prod_so_far);
        }

        return max_prod;
    }
}
