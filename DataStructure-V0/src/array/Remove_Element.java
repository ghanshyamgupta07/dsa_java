package array;

import java.util.ArrayList;
import java.util.Arrays;

// return no. of unique elements after removing value from array
public class Remove_Element {

    public static void main(String[] args) {

        int [] arr = {1,3,1,1};
        int [] arr1 = {1,3,1,1};

        System.out.println(removeElement(arr,1));
        System.out.println(removeElement_method2(arr1,1));

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr));

    }

    public static int removeElement(int[] nums, int val) {
        if(nums == null)
            return 0;

        if (nums.length < 1)
            return nums.length;

        // take 2 pointers i and j , i will track distinct values index while j will compare with value to remove and copy to i pointer
        // in case we dont need to remove the value and proceed further

        int i = -1;  // assuming all array element might be same as val to be removed
        int j = 0;
        while (j < nums.length) {
            // if array element is not the val copy this to postion pointed by i
            if (nums[j] != val)
                nums[++i] = nums[j];
            // else simplly keep proceeding
            j++;
        }
        return i;
    }

    public static int removeElement_method2(int[] nums, int val) {

        if(nums == null)
            return 0;

        int i = -1;
        int j = 0;

        while (j<nums.length){
            if(nums[j]!=val){
                nums[++i] = nums[j];
            }
            j++;
        }

        return i;

    }

}
