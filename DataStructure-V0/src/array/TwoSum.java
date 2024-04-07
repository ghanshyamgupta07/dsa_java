package array;

import java.util.HashMap;
import java.util.Map;


// return indices of the two numbers such that they add up to target

public class TwoSum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {

        int [] res = new int[2];
        Map<Integer,Integer> valIndexMap = new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            int check = target-nums[i];
            if(valIndexMap.containsKey(check) == true){

                res[0] = i;
                res[1] = valIndexMap.get(check);
                return res;
            }else{
                valIndexMap.put(nums[i],i);
            }

        }

        return res;
    }
}
