package array;

public class JumpGame_CanReach {
    public static void main(String[] args) {
       int [] arr = {1, 2, 0, 3, 0, 0};
        System.out.print(canReach(arr,0));
    }

    private static boolean canReach(int[] arr,int i) {
         if(i>=arr.length-1){
             return true;
         }
         boolean res = false;
         for(int j=1;j<=arr[i];j++){
             res =  res | canReach(arr,i+arr[j]);
         }
        return res ;
    }
}
