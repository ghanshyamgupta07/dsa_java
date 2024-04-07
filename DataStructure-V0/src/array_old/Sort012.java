package array_old;

import java.util.Arrays;

public class Sort012
{

    public static void main(String[] args) {

        int [] arr = {1,2,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] nums) {

        int i=0; int j=0; int k=nums.length-1;

        while(j<=k){
            // only one block will be executed at one time
            if(nums[j] == 0){

                nums[j++] = nums[i];
                nums[i++] = 0;
            }else if(nums[j] == 2){ // will executed only when above if false

                nums[j] = nums[k];
                nums[k--] = 2;
            }else{  // will executed only when above if and else if false
                j++;
            }


        }
    }
}