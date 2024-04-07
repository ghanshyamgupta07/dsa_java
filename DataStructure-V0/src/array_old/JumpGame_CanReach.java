package array_old;

public class JumpGame_CanReach {
    public static void main(String[] args) {
       int [] arr = {1, 2, 0, 3, 0, 0};
       //int [] arr = {3,2,1,0,4};

        System.out.println(canReach(arr,0));
        System.out.println(canReach1(arr));
    }

    private static boolean canReach(int[] arr,int i) {

         if(i>=arr.length-1){
             return true;
         }
         boolean res = false;
         for(int j=1;j<=arr[i];j++){
             res =  res | canReach(arr,i+j);
         }
        return res ;
    }

    private static boolean canReach1(int[] arr) {
        //  int [] arr = {9, 0, 0, 3, 0, 0};
        int lastGoodIndPosition = arr.length-1;

        for(int i=lastGoodIndPosition-1;i>=0;i--){

            if(i+arr[i]>=lastGoodIndPosition)
                lastGoodIndPosition = i;

        }
         return  lastGoodIndPosition == 0;
    }

}
