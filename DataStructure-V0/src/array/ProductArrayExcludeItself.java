package array;

public class ProductArrayExcludeItself {
    public static void main(String[] args) {

        int [] arr = {12,0};
       //             1, 10, 30, 150, 900
                    // 180 600 360 300 900
        for(int e: productExcludeItself(arr))
        System.out.print(e+" ");
    }

    private  static int[] productExcludeItself(int [] nums){

        int [] res = new int[nums.length];
        int left = 1;
        for(int i=0;i<nums.length;i++){
            res[i] = left;
            left = left*nums[i];
        }
        int right = 1;
        for(int i= nums.length-1;i>=0;i--){
            res[i] = res[i]*right;
            right = right*nums[i];
        }
        return res;



    }
}
