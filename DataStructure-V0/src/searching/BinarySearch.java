package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 3, 12, 7, 1, 8, 6};
        int res_ind = binarySearch(arr,9);
        System.out.println(res_ind);
    }

    public static int binarySearch(int [] arr, int item){

        return binarySearch(arr,item,0,arr.length-1);
    }

    private static int binarySearch(int [] arr,int item,int start, int end){

        while(start<=end){
            int mid =  start + (end-start)/2;
            if(arr[mid] == item){
                return mid;
            }else if(arr[mid]>item){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return -1;
    }
}
