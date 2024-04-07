package string_old;

public class StringCompression {
    public static void main(String[] args) {

        String str = "abcccccaaan";


        System.out.println(compress(str));
    }

    private static String compress(String input){

        if(input == null || input.length() == 0)
            return input;

    StringBuffer res = new StringBuffer();
    // "abcccccaaab";
    int i=0 ; int count = 0;
    while(i<input.length()){
       char curr = input.charAt(i);
       count = 1;
       while(i<input.length()-1 && input.charAt(i) == input.charAt(i+1)){
           count++;
           i++;
       }
       res.append(curr);
       res.append(count);
       i++;
    }



    return res.toString();

    }
}
