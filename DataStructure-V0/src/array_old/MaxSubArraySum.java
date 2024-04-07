package array_old;

public class MaxSubArraySum {
    public static void main(String[] args) {
        long [] arr = {-1,-2,-3,-4};        
        System.out.println(maxSubarraySum(arr,arr.length));
    }
 
    private  static long maxSubarraySum(long arr[], int n){
        
        long max_till_now = Long.MIN_VALUE;
        long max = max_till_now;
        
        for(int i=0;i<n;i++){

         max_till_now = Long.max(arr[i],max_till_now+arr[i]);   
         max = Long.max(max_till_now,max);   
            
            
        }    
       return max;
    }


}
