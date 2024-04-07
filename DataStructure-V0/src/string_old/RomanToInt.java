package string_old;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {




       // System.out.println(romanToInt("MCMXCIV"));

    }

    public static int romanToInt(String s) {

        HashMap<Character,Integer> mapping = new HashMap<>();
        mapping.put('I',1); mapping.put('V',5); mapping.put('X',10); mapping.put('M',1000);
        mapping.put('L',50); mapping.put('C',100); mapping.put('D',500);
        int res = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(i>0 && s.charAt(i) =='V' )
            {
                if(s.charAt(i-1) =='I')
                    res = res + 4 ;
                if(s.charAt(i-1) =='I')
                    res = res + 4 ;
            }
            res = res + mapping.get(s.charAt(i));
        }
        return res;

    }
}
