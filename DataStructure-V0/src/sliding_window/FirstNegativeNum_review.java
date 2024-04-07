package sliding_window;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeNum_review {

    public static List<Integer> firstNegativeNum(int[] arr, int k) {

        int i=0; int j=0;
        Queue<Integer> queue = new LinkedList();
        List<Integer> result = new ArrayList();

        while(j<arr.length){
            // processing
            if(arr[j]<0){
                queue.add(arr[j]);
            }
            if(j-i+1 == k) // reached to window
            {
                if(!queue.isEmpty())
                    result.add(queue.peek());
                else
                    result.add(0);
                if(arr[i]<0) queue.poll();
                i++;
            }
            j++;         // not reached window
        }

        return result;

    }

}
