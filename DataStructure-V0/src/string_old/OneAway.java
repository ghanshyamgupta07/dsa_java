package string_old;

public class OneAway {
    public static void main(String[] args) {

        String str1= "pales";
        String str2 = "palee";

        System.out.println(check(str1,str2));


    }
    private static boolean check(String str1 , String str2){
        int [] temp = new int[26];

        if(Math.abs(str1.length()-str2.length())>1)
            return false;

        for(char c: str1.toCharArray()){
            temp[c-'a']++;
        }
        for(char c: str2.toCharArray()){
            temp[c-'a']--;
        }

        int pos_diff = 0;
        int negdiff = 0;

        for(int a:temp){
            if(a >0 ) pos_diff++;
            if(a < 0 ) negdiff--;
            if(pos_diff>1 || negdiff>1) {
                return false ;
            }
        }
        return true;
    }
}
