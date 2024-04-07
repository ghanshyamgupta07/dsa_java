package string_old;
import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String str = "XIX";
        System.out.println(convert(str));
    }
    private static  int convert(String s){
        HashMap<Character,Integer> mapping = new HashMap<>();
        mapping.put('I',1); mapping.put('V',5); mapping.put('X',10); mapping.put('M',1000);
        mapping.put('L',50); mapping.put('C',100); mapping.put('D',500);
        int res = 0;
        for(int i=0;i<s.length();i++){
            if (i != s.length() - 1 && mapping.get(s.charAt(i)) <
                    mapping.get(s.charAt(i + 1))){
                res += mapping.get(s.charAt(i + 1)) -
                        mapping.get(s.charAt(i));
                i++;
            }else{
                res += mapping.get(s.charAt(i));
            }
        }
        return res;
    }
}
