package testing;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        int arr[] = {1,4,2,1,1,2};



        for(int i=0;i<arr.length;i++){
            while(arr[i]>0){
                int ind = arr[i]-1;
                arr[i] = arr[ind];
                if(arr[ind]<0) // already processed
                {
                    arr[ind]--;
                    arr[i] = 0;
                }else{ // first time
                    arr[ind] = -1;
                }
            }
        }



        System.out.println(Arrays.toString(arr));

    }
}
