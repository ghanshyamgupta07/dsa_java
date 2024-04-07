package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {5,3,12,7,1,8,6};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int [] arr ){

        // [2,6,5,4, 1,7]
        int i = 0;
        while(i<arr.length-1){
            int j= i+1;
            int tmp = arr[j];
            while(j>0 && tmp < arr[j-1]){
                j--;
                arr[j+1] = arr[j];
            }
            arr[j] = tmp;
            i++;

        }

    }
}
