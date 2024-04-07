package testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        Set<Integer> is_processed = new HashSet<>();

        for(int i=0; i<strs.length;i++){
            List anagramList=null;
            if(!is_processed.contains(i)){
                anagramList = new ArrayList<String>();
                is_processed.add(i);
                anagramList.add(strs[i]); // even don't get an anagram need to have in list
                for(int j=i+1; j<strs.length && !anagramList.contains(j) ;j++){
                    if(isAnagram(strs[i],strs[j])) {
                        anagramList.add(strs[j]);
                        is_processed.add(j);
                    }

                }
            }

            if(anagramList!=null)
                result.add(anagramList);

        }

        return result;

    }



    private static boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        if(s1.equals(s2)) return true;

        int [] arr = new int [26];
        int i=0;
        while(i<s1.length()){
            int s1Ind = s1.charAt(i) - 'a';
            int s2Ind = s2.charAt(i++) - 'a';
            arr[s1Ind]++;
            arr[s2Ind]--;
        }

        for(int e : arr){
            if(e!=0) return false;
        }
        return true;
    }
}
