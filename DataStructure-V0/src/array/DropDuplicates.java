package array;

import java.util.Arrays;

public class DropDuplicates {
    public static void main(String[] args) {
        int [] arr = {2,2,1,3,5,5,4,4,4};
        Arrays.sort(arr);
        int ind = dropDuplicates(arr);
        for(int i=0;i<=ind;i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static int dropDuplicates(int [] arr){
        int i=0; // single element is unique always
        int j = 1;
        while(j<arr.length){
            if(arr[i] != arr[j]){ // got a unique
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        return i;
    }
}
