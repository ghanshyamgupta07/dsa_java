package dynamic_programming;

public class EditDistance {

    public static void main(String[] args) {

        String str1 = "apd";
        String str2 = "abcd";
       int res = editDistanceRecursive(str1,str1.length(),str2,str2.length());
       System.out.println(res);
       int res1 = editDistance(str1,str1.length(),str2,str2.length());
       System.out.print(res1);

    }

    private static int min(int a, int b ,int c){
     return Math.min(Math.min(a,b),c);
    }

    private static int editDistanceRecursive(String s1, int m, String s2,int n){

        // if string is empty return other length
         if(m==0) return n;
         if(n==0) return m;

         if(s1.charAt(m-1) == s2.charAt(n-1)){
             return editDistanceRecursive(s1,m-1,s2,n-1);
         }else{
           return 1+ min(
                    editDistanceRecursive(s1,m-1,s2,n),
                    editDistanceRecursive(s1,m,s2,n-1),
                    editDistanceRecursive(s1,m-1,s2,n-1));
         }

    }

    private static int editDistance(String s1, int m, String s2,int n){

        int[][] T = new int[m+1][n+1];

        for(int i=0;i<=n;i++)
            T[0][i] = i;
        for(int j=0;j<=m;j++)
            T[j][0] = j;

        for(int i=1;i<=m;i++){
         for(int j=1;j<=n;j++){

             if(s1.charAt(i-1) == s2.charAt(j-1)){
                 T[i][j] = T[i-1][j-1] ;
             }else{
                 T[i][j] = 1+ min(
                         T[i-1][j],
                         T[i][j-1],
                         T[i-1][j-1]);
             }

         }
        }

         return T[m][n];
    }

}
