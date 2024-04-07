package stack;

import java.util.PriorityQueue;
import java.util.Stack;

public class Longest_Valid_Parentheses {

    public static void main(String[] args) {

        System.out.println(longest_valid_parentheses("((()()"));       // prints 4
        System.out.println(longest_valid_parentheses("(((()"));        // prints 2
        System.out.println(longest_valid_parentheses("(((("));         // prints 0
        System.out.println(longest_valid_parentheses("()()"));         // prints 4
        System.out.println(longest_valid_parentheses("(()())(()"));    // prints 6




    }

    private static int longest_valid_parentheses(String str){
        Stack<Integer> stack = new Stack<>();
        stack.add(-1);
        int res = 0;
       //   ((()()"))       4
       // [-1,0,1,2,3]
        for(int i=0;i<str.length();i++){

          if(str.charAt(i) == '('){
              stack.add(i);
          }else{

              if(!stack.isEmpty()){
                  stack.pop(); // remove ( or -1
              }
              if(!stack.isEmpty()){
                  res = Math.max(res,i-stack.peek());
              }else{
               stack.add(i);
              }

          }

       }
       return res;
    }

}
