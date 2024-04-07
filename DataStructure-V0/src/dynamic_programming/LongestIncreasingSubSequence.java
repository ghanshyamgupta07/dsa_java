package dynamic_programming;

import com.sun.deploy.util.ArrayUtil;

import java.sql.Array;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class LongestIncreasingSubSequence {

    public static void main(String[] args) {

        int []  x = {50,3,10,7,40,80};
        int []  y = x.clone();

        Arrays.sort(y);


        for(int a: x){
            System.out.print(a+" ");
        }
        System.out.println();
        for(int a: y){
            System.out.print(a+" ");
        }

        int res1 = longestCommonSubSequence_TopDown(x,y,x.length,y.length);
        System.out.println(res1);

        int res2 = lis(x,x.length);
        System.out.println(res2);

    }


    private static int lis(int arr[], int n)
    {
        SortedSet<Integer> hs = new TreeSet<>();
        // Storing and Sorting unique elements.
        for (int i = 0; i < n; i++)
            hs.add(arr[i]);
        int lis[] = new int[hs.size()];
        int k = 0;
        // Storing all the unique values in a sorted manner.
        for (int val : hs) {
            lis[k] = val;
            k++;
        }

        System.out.println("original array");
        for(int a: arr){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("sorted  array");
        for(int a: lis){
            System.out.print(a+" ");
        }


        int m = k, i, j;
        int dp[][] = new int[m + 1][n + 1];

        // Storing -1 in dp multidimensional array.
        for (i = 0; i < m + 1; i++) {
            for (j = 0; j < n + 1; j++) {
                dp[i][j] = -1;
            }
        }

        // Finding the Longest Common Subsequence of the two
        // arrays
        for (i = 0; i < m + 1; i++) {
            for (j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                else if (arr[j - 1] == lis[i - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }
                else {
                    dp[i][j]
                            = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    private static int longestCommonSubSequence_TopDown(int[] arr1,int[] arr2,int n1, int n2) {

        int T [][] = new int[n1+1][n2+1];

        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(arr1[i-1] == arr2[j-1]){
                    T[i][j] = 1 + T[i-1][j-1];
                }else{
                    T[i][j] = Math.max(T[i-1][j],T[i][j-1]);
                }

            }
        }

        return   T[n1][n2];

    }


}
