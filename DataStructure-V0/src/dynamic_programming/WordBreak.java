package dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {

        String[] dictionary = { "mobile", "samsung",  "sam",  "sung", "man",
                "mango",  "icecream", "and",  "go",   "i",
                "like",   "ice",      "cream" };

        List<String> dict = new ArrayList<>();
        for(String s : dictionary){
            dict.add(s);
        }

        String word = "ilikesamsung";
        boolean res = wordBreak(word,dict);
        System.out.print(res);
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        int maxLen = Integer.MIN_VALUE;
        for (String word : wordDict) {
            maxLen = (word.length() > maxLen) ? word.length() : maxLen;
        }

        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <i ; j++) {
                if ((i - j) > maxLen) {
                    continue;
                }
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
