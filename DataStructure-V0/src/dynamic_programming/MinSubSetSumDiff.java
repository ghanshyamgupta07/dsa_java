package dynamic_programming;

public class MinSubSetSumDiff {
    public static void main(String[] args) {

        int [] arr ={3, 1, 4, 2, 2, 1 };
        int sum = 0;
        for(int a: arr) sum+=a;
        System.out.println(minSubSetSumDiff(arr,sum,arr.length));
    }

    public static int minSubSetSumDiff(int[] arr, int sum , int n) {

        boolean[][] T = new boolean[n + 1][sum + 1];
        // update first col -- iterate over rows
        for (int i = 0; i <T.length; i++) {
            T[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {

                if(arr[i-1]<=j){
                   T[i][j] =  T[i-1][j-arr[i-1]]
                            || T[i-1][j];
                }else{
                    T[i][j] = T[i-1][j];
                }

            }
        }

        // Initialize difference of two sums.
        int diff = Integer.MAX_VALUE;

        // Find the largest j such that dp[n][j]
        // is true where j loops from sum/2 t0 0
        for (int j = sum / 2; j >= 0; j--) {
            // Find the
            if (T[n][j] == true) {
                diff = sum - 2 * j;
                break;
            }
        }
        return diff;



}

}
