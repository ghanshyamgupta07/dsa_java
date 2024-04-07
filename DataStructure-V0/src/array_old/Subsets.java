package array_old;
import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {

        int [] nums = {1,2,3};
        for(List<Integer> list : subsets(nums)){
            for(int i: list){
                System.out.println(i+" ");
            }
            System.out.println();
        }

    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            List<Integer> lst = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                lst.add(nums[j]);
            }
            result.add(lst);
        }

        return  result;

    }
}
