package testing;

import java.util.HashMap;
import java.util.Map;

class WordPattern {

        private static boolean check(String [] words, String pattern){

            Map<Character,String> map1 = new HashMap<>();
            Map<String,Character> map2 = new HashMap<>();

            for(int i=0;i<pattern.length();i++){
                char c = pattern.charAt(i);
                String word = words[i];

                if(!map1.containsKey(c)){
                    map1.put(c,word);
                }
                if(!map2.containsKey(word)){
                    map2.put(word,c);
                }
                if(!map1.get(c).equals(word) || map2.get(word)!=c) return false;

            }
            return true;
        }


    private static boolean word_pattern(String s, String pattern){

        String [] words = s.split(" ");
        if(words.length != pattern.length()) return false;

        Map<Character,String> map = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String word = words[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(word)) return false;
            }else{
                map.put(c,word);
            }
        }
        return true;
    }



    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(word_pattern(s,pattern));
    }
}