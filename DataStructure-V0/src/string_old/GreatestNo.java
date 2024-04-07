package string_old;

import java.util.Arrays;

public class GreatestNo {

    public static void main(String[] args) {

        int [] nums = {3,30,34,5,9};
        largestNumber(nums);
        //System.out.println(largestNumber(nums));

    }

    public static void largestNumber(int[] nums) {

        int i = nums.length-1;

        while(i>=0){
            int j = i;
            while(j>0 && shouldSwap(nums[j],nums[j-1])){
                j--;
            }
            swap(nums,i,j);
            i--;
        }
       // "9534330"
        System.out.println(Arrays.toString(nums));

    }

    private static void swap(int[] nums, int i, int j) {

        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;

    }

    private static boolean shouldSwap(int a , int b){

        String ab = a+""+b;
        String ba = b+""+a;

        System.out.println(ab);
        System.out.println(ba);
        if(Integer.parseInt(ab)>Integer.parseInt(ba))
            return true;
        else
            return false;

    }
}
