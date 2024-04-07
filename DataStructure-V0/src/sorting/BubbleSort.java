package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int [] arr = {5,3,12,7,1,8,6};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){ // swap
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
