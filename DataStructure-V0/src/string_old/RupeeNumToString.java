package string_old;

import java.util.HashMap;
import java.util.Scanner;

public class RupeeNumToString {
    static HashMap<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("please provide a valid number");
//        int number = in.nextInt();
        int number = 000111;
        System.out.println(convert(number));

    }

    private static String convert(int num) {
        // 13,15,72,3,65
        //

        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "tweleve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "fifteen");
        map.put(16, "sixteen");
        map.put(17, "sevenTeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(30, "thirty");
        map.put(20, "twenty");
        map.put(40, "fourty");
        map.put(50, "fifty");
        map.put(60, "sixty");
        map.put(70, "seventy");
        map.put(80, "eighty");
        map.put(90, "ninty");

        if(num==0) return "zero";

        int oneCr = 10000000;
        int oneLack = 100000;
        int oneThousand = 1000;
        int oneHundred = 100;
        String res = "";
        int crs = num / oneCr;
        num = num % oneCr;
        if (crs > 0) res = res + parse(crs) + " crore, ";
        int lacks = num / oneLack;
        num = num % oneLack;
        if (lacks > 0) res = res + parse(lacks) + " lacks, ";


        int thousands = num / oneThousand;
        num = num % oneThousand;
        if (thousands > 0) res = res + parse(thousands) + " thousands, ";


        int hundreds = num / oneHundred;
        num = num % oneHundred;
        if (hundreds > 0) res = res + parse(hundreds) + " hundreds, ";
        if (num > 0) res = res + parse(num);
        return res;
    }

    private static String parse(int n) {
        String res = "";
        if (n < 20)
            return map.get(n);
        else {
            String a = map.get(n / 10 * 10);
            String b = map.get(n % 10);
            res = res + a + " " + b;
        }
        return res;
    }

}
