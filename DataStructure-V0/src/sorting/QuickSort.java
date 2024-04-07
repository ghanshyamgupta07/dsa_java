package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
     int [] arr = {5,3,12,7,1,8,6};
     System.out.println(Arrays.toString(arr));
     quickSort(arr);
     System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int [] arr) {
        quickSort(arr,0,arr.length-1);
    }
    public static void quickSort(int [] arr, int left , int right) {

        if(left<right)
        {
        // divide the array in two part left to pIndex all smaller and right to pIndex all higher values
            int pIndex = partition(arr,left,right);
            quickSort(arr,left,pIndex-1);
            quickSort(arr, pIndex+1, right);
        }


    }

    private static int partition(int[] arr, int left, int right) {
        // take any Pivot(reference value to compare)
        int pivot = arr[right];
        int pIndex = left;
        // [-1, 2, 13, -4, 5, 6,4]
        for(int i=left;i<right;i++) {

            if(arr[i]<=pivot) {
                swap(arr,i,pIndex);
                pIndex++;
            }

        }

        swap(arr,pIndex,right);
        return pIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
