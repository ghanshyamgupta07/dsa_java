package array;

public class First_Last_Position_Sorted_Array {

    public int[] searchRange(int[] nums, int target) {

        int [] result = new int[2];

        if(nums == null || nums.length ==0 || nums[0]>target || nums[nums.length-1] <target)
        {
            result[0] = -1;
            result[1] = -1;
            return result;
        }

        result[0] = getFirst_last(nums, target, 0,nums.length-1,true);
        result[1] = getFirst_last(nums, target, 0,nums.length-1,false);
        return result;

    }

    private static int getFirst_last(int [] nums , int target , int start , int end,boolean isFirst){

        int result = -1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(nums[mid] == target && isFirst) {
                result =mid;
                end = mid-1;
            }
            else if(nums[mid] == target && !isFirst) {
                result =mid;
                start = mid+1;
            }
            else if(nums[mid] < target) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return result;
    }

}
