package string_old;

public class StringTrdy {

    public static void main(String[] args) {

        String s = "deeee";

        for (int i=0; i<s.length();i++){

             String ss = s.substring(0,i) + s.substring(i+1,s.length());

             System.out.println(ss+" "+isPalindrom(ss));
        }


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
