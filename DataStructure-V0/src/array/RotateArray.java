package array;

public class RotateArray {

    public static void main(String[] args) {

        int [] arr = {2,4,6,8,10,12,14,16,18,20}; // 4,5,1,2,3,

        int num_rorate = 3;
        rotate(arr,num_rorate,false);
        for(int i: arr)
            System.out.print(i+" ");

    }

    private static void rotate(int [] arr , int nums_rotate , boolean clock_wise){
      if(clock_wise){
          nums_rotate = arr.length-nums_rotate;
      }
      reverse(arr,0,nums_rotate-1);
      reverse(arr,nums_rotate,arr.length-1);
      reverse(arr,0,arr.length-1);


    }

    private static void  reverse( int[] arr , int start , int end){

        while(start<end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
