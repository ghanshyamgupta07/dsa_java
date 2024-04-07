package dynamic_programming;

public class CoinChanges {
    public static void main(String[] args) {

        int [] coins ={1,2,5};
        int sum = 11;

       int res1 = coin_changes_recursive(coins,sum,coins.length);
       int res2= coin_changes(coins,sum,coins.length);

        System.out.print("recursive "+res2 + " top down "+res1);



    }

    private static int coin_changes_recursive(int [] coins, int sum , int n){

        if(sum==0) return 1;
        if(n==0) return 0;

        if(coins[n-1]<=sum){
            return  coin_changes_recursive(coins,sum-coins[n-1],n) +
                    coin_changes_recursive(coins,sum,n-1);
            }
        else{
            return coin_changes_recursive(coins,sum,n-1);
        }
    }

    private static int coin_changes(int [] coins, int sum , int n) {

        int T[][] = new int[n + 1][sum + 1];

        for (int i = 0; i < n; i++) {
            T[i][0] = 1;    // populate first col with 1 as for sum = 0 counts = 1
        }


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {

                if (coins[i - 1] <= j) {
                    T[i][j] =   T[i][j - coins[i - 1]] + T[i - 1][j];
                } else {
                    T[i][j] = T[i - 1][j];
                }

            }

        }
        return T[n][sum];

    }
}
