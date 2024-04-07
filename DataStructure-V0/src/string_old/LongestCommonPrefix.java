package string_old;
import java.util.ArrayList;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String []  arr1 = {"flower","fly","flight","flow"};
        ArrayList<String> arr = new ArrayList<>();
        for(String s: arr1)
            arr.add(s);
        myMethod(arr);
        leetcodeMethod(arr);
    }
    //  {"flower","fly","flight","flow"};
    private static void leetcodeMethod(ArrayList<String> arr) {
        String prefix = arr.get(0); // flower
        for(int i=1;i<arr.size();i++){
            while(arr.get(i).indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println(prefix);
    }

    private static void myMethod(ArrayList<String> arr) {
        StringBuffer tempMatch = new StringBuffer();
        String finalMatch = arr.get(0);
        String temp = finalMatch;

        for(int i=1;i<arr.size();i++){ // it
            int k =0;
            for(int j=0;j<arr.get(i).length();j++){ // iterate through each  char
                if(k<temp.length() && temp.charAt(k)==arr.get(i).charAt(j)){
                    tempMatch.append(temp.charAt(k++));
                }else{
                    if(tempMatch.length()<finalMatch.length())
                        finalMatch = tempMatch.toString();
                    tempMatch.setLength(0);
                    break;
                }
            }
            temp = finalMatch;
        }
        System.out.println(finalMatch);


    }


}
