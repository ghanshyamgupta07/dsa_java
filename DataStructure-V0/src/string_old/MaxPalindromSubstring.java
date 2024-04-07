package string_old;


public class MaxPalindromSubstring {

   static int max = Integer.MIN_VALUE;
   static String res = "";
    public static void main(String[] args) {
        String str = "abca";
        countSubstrings(str);

        System.out.println(res);
    }

    private static void updateMaxPalindrom(String str, int i, int j){

        while(i>=0 && j<str.length() && (str.charAt(i) == str.charAt(j)))  {

            if(j-i+1>max){
                max = j-i+1;
                res = str.substring(i,j+1);
            }

        i--;
        j++;
        }

    }





    private static void countSubstrings(String str){

                 for(int i=0;i<str.length();i++){
                     updateMaxPalindrom(str,i,i);
                     updateMaxPalindrom(str,i,i+1);
                 }





    }

}
