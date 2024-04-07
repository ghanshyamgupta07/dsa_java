package array_old;

import java.util.HashSet;

public class FirstMissingPositive {

    public static void main(String[] args) {
       int [] arr =  {2147483647};
        firstMissingPositive(arr);
    }

    public static int firstMissingPositive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
         for(int num:nums)
         {
             if(num>0) set.add(num);

         }
            int i=1;
        for(; i<=Integer.MAX_VALUE;i++){
            if(!set.contains(i)){
                System.out.println("first positive missing no "+i);
                break;
            }
        }


       return i;
    }
}
