package dynamic_programming;

public class CountSubSetSumForX {

    public static void main(String[] args) {

        int [] arr ={1,2,3,3};
        int sum = 6;
        System.out.println(countSubSetSumForXRecusrive(arr,sum,arr.length));
        System.out.println(countSubSetSumForX(arr,sum,arr.length));

    }

    private static int countSubSetSumForXRecusrive(int[] arr, int sum, int n) {

        if (sum == 0) return 1;
        if (n == 0) return 0;

        if (arr[n - 1] <= sum) {

            return countSubSetSumForXRecusrive(arr, sum - arr[n - 1], n - 1) +
                    countSubSetSumForXRecusrive(arr, sum, n - 1);
        } else {
            return countSubSetSumForXRecusrive(arr, sum, n - 1);
        }


    }

    public static int countSubSetSumForX(int[] arr, int sum, int n) {

        int [][] T = new int [n+1][sum+1];

        for(int i=0;i<=n;i++){
            T[i][0] = 1;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){

                if (arr[i - 1] <= j) {

                  T[i][j] = T[i-1][j - arr[i - 1]] +
                          T[i-1][j] ;
                } else {
                    T[i][j] =  T[i-1][j] ;
                }


            }
        }

         return T[n][sum];

    }
}