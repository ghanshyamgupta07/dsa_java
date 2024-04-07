package dynamic_programming;

public class LongestCommonSubSequence {

    public static void main(String[] args) {

        String x ="ABCDEFG";
        String y = "AEFOPABCD";

        int res = longestCommonSubSequence_Recursive(x,y,x.length(),y.length());
        System.out.println(res);

        int res1 = longestCommonSubSequence_TopDown(x,y,x.length(),y.length());
        System.out.println(res1);
    }

    private static int longestCommonSubSequence_Recursive(String str1, String str2, int n1, int n2) {

      if(n1 == 0 || n2 ==0) return 0;

      if(str1.charAt(n1-1) == str2.charAt(n2-1)){
          return 1 + longestCommonSubSequence_Recursive(str1,str2,n1-1,n2-1);
      }else{
          return Math.max(longestCommonSubSequence_Recursive(str1,str2,n1,n2-1),
                  longestCommonSubSequence_Recursive(str1,str2,n1-1,n2));
      }


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
        print(str1,str2,T);
        return   T[n1][n2];

    }

    private static void print(String str1, String str2, int[][] T) {

        // Following code is used to print LCS
        int index = T[str1.length()][str2.length()];


        // Create a character array to store the lcs string
        char[] lcs = new char[index];


        // Start from the right-most-bottom-most corner and
        // one by one store characters in lcs[]
        int i = str1.length();
        int j = str2.length();
        while (i > 0 && j > 0)
        {
            // If current character in X[] and Y are same, then
            // current character is part of LCS
            if (str1.charAt(i-1) == str2.charAt(j-1))
            {
                // Put current character in result
                lcs[index-1] = str1.charAt(i-1);

                // reduce values of i, j and index
                i--;
                j--;
                index--;
            }

            // If not same, then find the larger of two and
            // go in the direction of larger value
            else if (T[i-1][j] > T[i][j-1])
                i--;
            else
                j--;
        }
        System.out.print("LCS of "+str1+" and "+str2+" is ");
        for(int k=0;k<lcs.length;k++)
            System.out.print(lcs[k]);

    }
}
