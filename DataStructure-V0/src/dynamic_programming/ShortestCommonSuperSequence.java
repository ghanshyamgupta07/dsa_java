package dynamic_programming;

public class ShortestCommonSuperSequence {

    public static void main(String[] args) {

        String x = "abac";
        String y = "cab";

        int shortestCommonSubSeq = x.length() + y.length() - longestCommonSubSequence_TopDown(x,y,x.length(),y.length());

        System.out.println(shortestCommonSubSeq);
    }

    private static int longestCommonSubSequence_TopDown(String str1,String str2,int n1, int n2) {

        int T [][] = new int[n1+1][n2+1];

        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){

                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    T[i][j] = 1 + T[i-1][j-1];
                }else{
                    T[i][j] = Math.max(T[i-1][j],T[i][j-1]);
                }

            }
        }
        return   T[n1][n2];

    }
}
