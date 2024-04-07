package dynamic_programming;

public class LongestCommonSubString {

    public static void main(String[] args) {

        String x ="ABCDEFG";
        String y = "ABXDEGU";

        int res = longestCommonSubString_Recursive(x,y,x.length(),y.length());
        System.out.println(res);

        int res1 = longestCommonSubString(x,y,x.length(),y.length());
        System.out.println(res1);
    }

    private static int longestCommonSubString_Recursive(String str1, String str2, int n1, int n2) {

      if(n1 == 0 || n2 ==0) return 0;

      int cnt = 0;
      if(str1.charAt(n1-1) == str2.charAt(n2-1)){
          cnt  = 1 + longestCommonSubString_Recursive(str1,str2,n1-1,n2-1);
      }else{
          cnt =  Math.max(cnt,Math.max(longestCommonSubString_Recursive(str1,str2,n1,n2-1),
                  longestCommonSubString_Recursive(str1,str2,n1-1,n2)));
      }

      return cnt;
    }

    public static int longestCommonSubString(String str1,String str2,int n1, int n2) {

        int T [][] = new int[n1+1][n2+1];
        int cnt = 0;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){

                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    T[i][j] = 1 + T[i-1][j-1];
                     cnt = Math.max(cnt,T[i][j]);
                }else{
                    T[i][j] = 0;
                }

            }
        }
        print(str1,str2,T,cnt);
        return  cnt;

    }


    private static void print(String str1, String str2, int[][] T,int cnt) {

         int a=0;
         int b=0;
        for(int i=0;i<T.length;i++){
            for(int j=0;j<T[0].length;j++){
                if(T[i][j] == cnt) {
                    //System.out.println(T[i][j] + " ");
                   a = i;
                   b = j;
                   break;
                }
            }
        }
        System.out.println(" a  is " + a);
        System.out.println(" b is " +b);
            while(a>=0 && b>=0){

                System.out.print(str1.charAt(a) + " ");
                a--;
                b--;
            }




    }
}
