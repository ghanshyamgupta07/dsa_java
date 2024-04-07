package string_old;


public class PalindromSubstring {

   int max = 0;
   String str = "";
    public static void main(String[] args) {
        String str = "fdsklf";
        countSubstrings(str);
    }

    private static int countPalindrom(String str, int i, int j){
        int count = 0;
        while(i>=0 && j<str.length() && (str.charAt(i) == str.charAt(j))) {
            System.out.println(str.substring(i,j+1));
            count++;
            i--;
            j++;
        }
       return  count;
    }





    private static void countSubstrings(String str){
        int finalCount = 0;
        for(int i=0;i<str.length();i++){

                 finalCount += countPalindrom(str,i,i);
                 finalCount += countPalindrom(str,i,i+1);

        }

        System.out.println(finalCount);

    }

}
