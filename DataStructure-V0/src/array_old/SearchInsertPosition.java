package array_old;

public class SearchInsertPosition {

    public static void main(String[] args) {

    }
    public int searchInsert(int[] nums, int target) {

        int pos = 0;
        // Input: [1,3,5,6], 5

        for(int i=0;i<nums.length;i++){

            if(nums[i] == target)
                return i;
            if(target> nums[i])
                pos = i+1;

        }

        return pos;

    }

    public int searchInsert_improved(int[] nums, int target) {

        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(target > nums[mid]){
                low=mid+1;
            }else if(target < nums[mid]){
                high=mid-1;
            }else{
                return mid;
            }
        }

        return low;

    }
}
