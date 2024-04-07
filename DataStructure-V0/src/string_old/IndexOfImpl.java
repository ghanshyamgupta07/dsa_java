package string_old;

public class IndexOfImpl {

    public static void main(String[] args) {

        System.out.print(indexOfString("mississippi","issipi"));


    }

    private static int indexOfString(String haystack, String needle){


        // corner cases
        /* 1. return 0 if
        1.1 both string are empty or only substring is empty
        1.2 both string are equals
         */
        /* 1. string is empty but substring not then return -1
             or substring is greater than string
         */

        if(needle.length() == 0 || needle.equals(haystack)){
            return 0;
        }

        if(haystack.length() == 0 || haystack.length()<needle.length()){
            return -1 ;
        }

        for(int i=0;i<haystack.length()-needle.length();i++){

            if(haystack.charAt(i) == needle.charAt(0) && isSubString(haystack,i,needle))
                return i;

        }

       return -1;
    }

    private static boolean isSubString(String haystack, int i, String needle) {
      int j=0;
     while(i<haystack.length() && j<needle.length()){
         if(haystack.charAt(i) !=  needle.charAt(j))
             return false;
         i++;
         j++;
     }

     if(j == needle.length())
     return  true;
     return false;
    }

}
