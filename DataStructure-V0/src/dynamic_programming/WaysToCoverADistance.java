package dynamic_programming;

public class WaysToCoverADistance {
    public static void main(String[] args) {
        int n = 3;
        System.out.print(waysToCoverDistance(n));
    }

    private static int waysToCoverDistance(int n){

        int [] dp = new int[n+1];

        dp[0] = 1;
        if(n>1) dp[1] = 1;
        if(n>2) dp[2] = 2;
        for (int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }

        return dp[n];


    }

}
