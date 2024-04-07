package dynamic_programming;

public class SubSetSum {
    public static void main(String[] args) {

        int [] arr ={3, 34, 4, 12, 5};
        int sum = 5;
        System.out.println(is_subsetSum_recursive(arr,sum,arr.length));
        System.out.println(is_subsetSum(arr,sum,arr.length));
    }

    private static boolean is_subsetSum_recursive(int[] arr, int sum , int n){

     if(sum == 0) return true;
     if(n==0) return false;

     if(arr[n-1]<=sum){
      return  is_subsetSum_recursive(arr,sum-arr[n-1],n-1)
              || is_subsetSum_recursive(arr,sum,n-1);
     }else{
         return is_subsetSum_recursive(arr,sum,n-1);
     }
    }

    public static boolean is_subsetSum(int[] arr, int sum , int n) {

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

     return T[n][sum];

}

}
