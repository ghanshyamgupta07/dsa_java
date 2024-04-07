package array;

public class SubsetTargetSum {
    public static void main(String[] args) {
        int [] arr = {2,1,7,4,6};
        printSubSet(arr,6);
        printSubSetImproved(arr,6);

    }

    private static void printSubSet(int [] arr,int target){

    int current_sum;
     for(int i=0;i<arr.length;i++){
         current_sum = 0;
         for(int j=i;j<arr.length;j++){
          
            current_sum+=arr[j];
            if(current_sum == target){
                System.out.println(i+" , "+j);
                return;
            } 
         }

     }

     System.out.println("not available");

    }


   private static void printSubSetImproved(int [] arr,int target){

    if(target == 0 ){
        System.out.println("not available");
        return;
    }

    int i=0;int j=0;
    int current_sum = 0;
    while(j<arr.length){       
        current_sum += arr[j];
        if(current_sum == target){
            System.out.println(i+" , "+j);
            return;
        }else if(current_sum<target){           
            j++;
        }else{
            current_sum-=arr[i];
            current_sum-=arr[j];
            i++;
        }       

    }
    System.out.println("not available");

   }




}
