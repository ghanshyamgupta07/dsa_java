package dynamic_programming;

public class EqualSumPartition {

    public static void main(String[] args) {

        int [] arr = {1,2,2,3,2,1};

        int sum = 0;
        for(int a: arr) sum+=a;
        if(sum%2 ==0){
        boolean result = SubSetSum.is_subsetSum(arr,sum/2,arr.length);
        System.out.println(result);
        }
        else System.out.println("not possible");


    }
}
