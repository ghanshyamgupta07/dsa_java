package searching;

public class First_last_occurance {
    public static void main(String[] args) {
        int[] arr = {5, 3, 12, 7, 1, 8, 6};
        int res_ind = firstOccurance(arr,9,0,arr.length-1);
        System.out.println(res_ind);
        res_ind = lastOccurance(arr,9,0,arr.length-1);
        System.out.println(res_ind);
    }

    public static int firstOccurance(int [] arr,int item,int start, int end){

        int firstOccuranceIndex = -1 ;
        while(start<=end){
            int mid =  start + (end-start)/2;
            if(arr[mid] == item){
                firstOccuranceIndex = mid;
                end = mid-1;
            }else if(arr[mid]>item){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return firstOccuranceIndex;
    }

    public static int lastOccurance(int [] arr,int item,int start, int end){

        int lastOccuranceIndex = -1 ;
        while(start<=end){
            int mid =  start + (end-start)/2;
            if(arr[mid] == item){
                lastOccuranceIndex = mid;
                start = mid+1;
            }else if(arr[mid]>item){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return lastOccuranceIndex;
    }
}
