package string;

public class Atoi {
    public static void main(String[] args) {

        System.out.print(atoi("0001234"));
    }
    private static int atoi(String str){
        int res = 0;
        for(char c : str.toCharArray()){
            res = res*10 + c-'0';
        }
        return  res;
    }
}
