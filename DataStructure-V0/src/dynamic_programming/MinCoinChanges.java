package dynamic_programming;

import java.util.Arrays;

public class MinCoinChanges {
    public static void main(String[] args) {

        int [] coins ={1,2,5};
        int sum = 11;


       int res2= minCoinChanges(coins,sum);

        System.out.print("min Coins "+res2);



    }


    private static int minCoinChanges(int [] coins, int amount) {

        int [] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int i=0;i<=amount;i++) {
            for (int j = 0; j < coins.length; j++) {

                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }
            if(dp[amount] > amount){
                return -1;
            }
            return dp[amount] ;



    }
}
