package string_old;

class Solution {

    public static void main(String[] args) {
        System.out.println(validPalindrome("deeee"));
    }
    public static boolean validPalindrome(String s) {

        if(isPalindrom(s)) return true;


        for(int i=0;i<s.length();i++){
            String ss = s.substring(0,i) + s.substring(i+1,s.length());

            if(isPalindrom(ss)) {
                return true;

            }
        }

        return false;
    }

    private static boolean isPalindrom(String s){

        int i=0; int j=s.length()-1;

        while(i<j){

            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }

        }

        return true;

    }
}
