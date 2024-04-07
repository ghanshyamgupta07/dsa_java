package array;

import java.util.Arrays;
import java.util.Collection;

public class SortArrays {
    public static void main(String[] args) {
        int arr1[] = {0,3, 5, 7 };
        int arr2[] = {0,2,6,8,9};
 
     int i=0;int j=0;
     while(i<arr1.length && j<arr2.length){
        if(arr1[i]>arr2[j]){
            swap(arr1,arr2,i,j);
            i++;
            if(j<arr2.length-1 && arr2[j]>arr2[j+1]){
                update(arr2,j);                  
            }
         
        }else{
            i++;
        } 
    }
    
   System.out.println( Arrays.toString(arr1));
   System.out.println( Arrays.toString(arr2));

    }

    private static void update(int[] arr2, int j) {
        int tmp = arr2[j];
        while(j<arr2.length-1 && tmp>arr2[j+1]){
             
            arr2[j] = arr2[j+1];
            j++;
        }
        arr2[j] = tmp;
    }

    private static void swap(int[] arr1,int [] arr2 , int i,int j){
        int tmp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = tmp;
    }
}
