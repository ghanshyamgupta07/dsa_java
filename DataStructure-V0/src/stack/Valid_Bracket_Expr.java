package stack;

import java.util.Stack;

public class Valid_Bracket_Expr {

    public static void main(String[] args) {

        System.out.println(isValid_Bracket_Expr("[()]{}{[()()]()}"));       // prints 4
        System.out.println(isValid_Bracket_Expr("[(])"));        // prints 2
        System.out.println(isValid_Bracket_Expr("(((("));         // prints 0
        System.out.println(isValid_Bracket_Expr("()()"));         // prints 4
        System.out.println(isValid_Bracket_Expr("(()())(()"));    // prints 6




    }

    private static boolean isValid_Bracket_Expr(String str){

        Stack<Character> stack = new Stack<Character>();
          for(int i=0;i<str.length();i++){

          if(str.charAt(i) == '(' || str.charAt(i) == '{'||
                  str.charAt(i) == '['){
              stack.add(str.charAt(i));
          }else {

              if(!stack.isEmpty()){
                  char c = stack.pop();
                  if(str.charAt(i) == ')' && c!= '(')
                      return false;
                  if(str.charAt(i) == '}' && c!= '{')
                      return false;
                  if(str.charAt(i) == ']' && c!= '[')
                      return false;
              }

          }

       }
       return stack.isEmpty();
    }

}
