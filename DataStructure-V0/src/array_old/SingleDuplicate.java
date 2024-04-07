package array_old;

public class SingleDuplicate {

    public static void main(String[] args) {

        int [] nums = {1,3,4,2,2};
        findDuplicate(nums);
    }

    public static int findDuplicate(int[] nums) {

        int i=0;
        while(nums[i]!=-1){

            if(nums[nums[i]]==-1) // already processed
            {
                return nums[i];
            }
            int tmp = nums[nums[i]]; // process
            nums[nums[i]] = -1;
            nums[i] = tmp;
        }

        return -1;
    }
}
