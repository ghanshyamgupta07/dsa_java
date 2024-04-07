package string_old;

public class Atoi {
    public static void main(String[] args) {

        System.out.print(atoi("-4193 with words"));
    }
    private static int atoi(String str){
        boolean is_pos = true;

        if(str.contains("-")){
            is_pos = false;
            str = str.substring(1);
        }
        int res = 0;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c))
            res = res*10 + c-'0';
        }
        res = is_pos ? res: res*(-1);
        return  res;
    }
}
