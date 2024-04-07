package sliding_window;

import java.util.HashMap;

public class CountAnagrams_review {
    public static void main(String[] args) {

        String str = "AACABBC"; String sub = "CA";
        System.out.println(countAnagrams(str,sub));
    }

    private static int countAnagrams(String mainStr, String toSearch){

        int i=0; int j=0; int anagram_count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: toSearch.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int unique_char_count = map.keySet().size();

        while (j<mainStr.length()){
            // processing
            char current_j = mainStr.charAt(j);
            if(map.containsKey(current_j)){
                map.put(current_j,map.get(current_j)-1);
                if(map.get(current_j) == 0)
                    unique_char_count--;
            }
             // reached window
             if(j-i+1 == toSearch.length()){
                if(unique_char_count == 0) anagram_count++;
                char current_i = mainStr.charAt(i++);
                map.put(current_i, map.getOrDefault(current_i, 0) + 1);
                // if current_i is added first time
                if(map.get(current_i) == 1)  unique_char_count++;
            }
            j++;
        }
        return anagram_count;
    }
}
