package array_old;

public class HouseRobber {
    public static void main(String[] args) {

        int [] nums = {2,1,1,2};
        System.out.println(houseRobber1(nums));

    }

    private static int houseRobber1(int [] nums)
    {
        int incl = nums[0];
        int excl = 0;
        int new_incl;

        // int [] nums = {2,1,1,2};
        for(int i=1;i<nums.length;i++){

            new_incl = excl+nums[i];
            excl = incl;
            incl = Math.max(incl,new_incl);

        }

        return Math.max(incl,excl);

    }

    private static int houseRobber2(int [] nums)
    {

     return 0;
    }
}
