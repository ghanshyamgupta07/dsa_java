package string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        System.out.print(getfirstNonReptingChar("abaccddbv"));
    }

    private static int getfirstNonReptingChar(String str){
        Map<Character,Integer> map = new HashMap();
        for(char c:str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1)
                return i;
        }
        return -1;
    }

}



