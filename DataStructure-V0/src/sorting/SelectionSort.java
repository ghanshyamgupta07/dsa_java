package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,3,12,7,1,8,6};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap_by_index(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void selectionSort(int [] arr){

        for(int i=0;i<arr.length;i++){

            int minIndex = getMinIndex(arr,i,arr.length-1);

            if(i != minIndex) {
                swap_by_index(arr,i,minIndex);
            }

        }
    }

    private static int getMinIndex(int[] arr,int start,int end){
        int min = arr[start];
        int minIndex = start;
        for(int i=start+1;i<=end;i++){
            if(arr[i]<min){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
