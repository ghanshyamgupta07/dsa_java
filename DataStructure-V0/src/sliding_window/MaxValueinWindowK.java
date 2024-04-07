package sliding_window;

import java.util.*;

public class MaxValueinWindowK {
    public static void main(String[] args) {
        int [] arr = {1,3,-1,-3,5,3,6,7};
        //int [] arr = {9,11};
        //int [] arr = {9,10,9,-7,-4,-8,2,-6};
        int k = 3;
        maxSlidingWindow(arr,k);
        maxSlidingWindow1(arr,k);

    }

    public static void maxSlidingWindow(int[] nums, int k) {
        // for getting max value using max heap for min use min head i.e. remove reverseOrder
        PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
        int [] result = new int[nums.length-k+1];
        int i=0; int j=0;
        int ind = 0;

        while (j<nums.length) {
            // processing
           maxHeap.add(nums[j]);
           if(j-i+1 == k){ // reached window
                result[ind++] = maxHeap.peek();
                maxHeap.remove(nums[i]);
                i++;
            }
            j++; // still not reached window size so keep increasing window
        }
        System.out.println(Arrays.toString(result));
        }

    public static void maxSlidingWindow1(int[] nums, int k) {

        int [] result = new int[nums.length-k+1];
        Deque<Integer> queue = new LinkedList<>();
        int j=0; int i= 0;
        int ind = 0;
        while (j<nums.length){
            // pop all values from queue if we got a new max
            while (!queue.isEmpty() && nums[j]>queue.peekLast()) {
            queue.pollLast();
            }
            // keep adding smaller element as they could become max if current max goes out of window
            queue.offerLast(nums[j]);
             if(j-i+1 == k) { // reached window
                result[ind++] = queue.peekFirst();
                // max is being out of scope so pop from queue as well
                if(nums[i] == queue.peekFirst())
                    queue.pollFirst();
                i++;
            }
             j++;
        }
        System.out.println(Arrays.toString(result));
    }




}

