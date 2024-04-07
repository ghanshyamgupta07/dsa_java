package array;

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
}
