package dynamic_programming;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {

        String x ="ABCDDCP";

        String y = new StringBuffer(x).reverse().toString();

        int res1 = LongestCommonSubString.longestCommonSubString(x,y,x.length(),y.length());

        System.out.println(res1);
    }
}
