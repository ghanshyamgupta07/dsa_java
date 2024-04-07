package string_old;

import java.util.HashMap;
import java.util.Map;

class CountIndex{
    int count; int index;
    CountIndex(int count,int index){
        this.count=count;
        this.index = index;
    }
}

public class FirstNonRepeatingCharOptimized {

    public static void main(String[] args) {

        System.out.print(getfirstNonReptingChar("abaccddb"));
    }

    private static int getfirstNonReptingChar(String str){
        Map<Character,CountIndex> map = new HashMap();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.get(c).count++;
            }else{
                map.put(c,new CountIndex(1,i));
            }
        }
       int MinIndex = Integer.MAX_VALUE;
       for(Map.Entry<Character,CountIndex> enrty:map.entrySet())
       {
           if(enrty.getValue().count == 1 && MinIndex > enrty.getValue().index){
               MinIndex = enrty.getValue().index;
           }
       }
       if(MinIndex != Integer.MAX_VALUE)
           return MinIndex;
        return -1;
    }

}



