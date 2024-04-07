package string_old;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        System.out.print(getfirstNonReptingChar("abaccddbv"));
    }

    private static int getfirstNonReptingChar(String str){
        Map<Character,Integer> map = new HashMap();
        for(char c:str.toCharArray()){
          map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1)
                return i;
        }
        return -1;
    }

}



