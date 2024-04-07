package array;

import java.util.Map;

public class HouseRobber {
    public static void main(String[] args) {

        int [] nums = {10,1,1,2};
        System.out.println(houseRobber(nums));

        int include_first = houseRobber_cyclic(nums,0,nums.length-1);
        int exclude_first = houseRobber_cyclic(nums,1,nums.length);
        System.out.println(exclude_first);
        System.out.println(Math.max(include_first,exclude_first));

    }

    private static int houseRobber(int [] nums)
    {
        int incl = nums[0]; int excl = 0; int new_incl;
        for(int i=1;i<nums.length;i++){
            new_incl = excl+nums[i];
            excl = incl;
            incl = Math.max(incl,new_incl);
        }
        return Math.max(incl,excl);
    }

    private static int houseRobber_cyclic(int [] nums,int start, int end)
    {
        int incl = nums[start]; int excl = 0; int new_incl;
        for(int i=start+1;i<end;i++){
            new_incl = excl+nums[i];
            excl = incl;
            incl = Math.max(incl,new_incl);
        }
        return Math.max(incl,excl);
    }
}
