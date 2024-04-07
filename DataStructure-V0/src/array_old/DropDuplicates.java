package array_old;

public class DropDuplicates {

    public static void main(String[] args) {

        int [] arr = {1,2,2,3,4,4,4};
        int ind = dropDuplicates(arr);
        for(int i=0;i<=ind;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int dropDuplicates(int [] arr){

        int i=0;
        int j = 1;
        while(j<arr.length){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        return i;

    }



}
