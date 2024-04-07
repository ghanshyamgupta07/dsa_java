package string_old;

import java.util.Stack;

public class RemoveAdjacentDuplicates {

    public static void main(String[] args) {
        String str = "ABBCCCA";
        System.out.println(removeDup(str));

        System.out.println(removeDupUsingStack(str));


    }

    private static String removeDupUsingStack(String str) {

        Stack<Character> stack = new Stack<>();
        int i=0;
        while(i<str.length()){
            if(stack.isEmpty() || stack.peek() != str.charAt(i)){
                stack.push(str.charAt(i++));
            }else{
                stack.pop();
                i++;
            }
        }
        StringBuffer sb = new StringBuffer();
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }

        return sb.toString();

    }

    private static String removeDup(String str){
        
        if(str == null || str.length() == 0)
            return  str;

        StringBuffer sb = new StringBuffer();

        int i=0;
        while(i<str.length()){

           if(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
               i=i+2;
           else{
                sb.append(str.charAt(i++));
           }
            
        }
         if(checkForAdjacentDuplicates(sb.toString())){
             return removeDup(sb.toString());
         }else {
             return sb.toString();
         }

    }

    private static boolean checkForAdjacentDuplicates(String str) {
     for(int i=0;i<str.length()-1;i++){
         if(str.charAt(i) == str.charAt(i+1))
             return true;
     }
        return false;
    }

}
