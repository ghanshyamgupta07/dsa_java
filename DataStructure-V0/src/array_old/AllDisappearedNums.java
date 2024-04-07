package array_old;

import java.util.ArrayList;
import java.util.List;

public class AllDisappearedNums {

    public static void main(String[] args) {

         int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
        System.out.println(findDisappearedNumbers_withoutExtraSpace(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int [] temp = new int[nums.length+1];
        List<Integer> res = new ArrayList<Integer>();

        for(int num: nums){
            temp[num] = 1;
        }

        for(int i=1;i<temp.length;i++)
        {
            if(temp[i] == 0)
                res.add(i);
        }

        return res;
    }

    public static List<Integer> findDisappearedNumbers_withoutExtraSpace(int[] nums) {


        List<Integer> res = new ArrayList<Integer>();


        for(int i=0;i<nums.length;i++) {
            int item = nums[i];
            while (item != -1) {
                int ind = item - 1;
                item = nums[ind];
                nums[ind] = -1;
            }
        }

        for(int i=0;i<nums.length;i++) {
            int item = nums[i];
            while (item != -1) {
                int ind = item - 1;
                item = nums[ind];
                nums[ind] = -1;
            }
        }


        for(int i=0;i<nums.length;i++){

            if(nums[i]>0){
                System.out.println(i+1);
            }
        }


        return res;
    }



}
