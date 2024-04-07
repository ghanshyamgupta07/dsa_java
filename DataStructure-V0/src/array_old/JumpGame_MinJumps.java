package array_old;

public class JumpGame_MinJumps {
    public static void main(String[] args) {
       int [] arr = {2,3,1,1,4};
        System.out.println(minJumps(arr));
    }


    private static int minJumps(int[] nums) {
        int end=0,farthest=0;int jump=0;
        for(int i=0;i<nums.length-1;i++){
            farthest = Math.max(farthest, i + nums[i]);
            if(i == end){
                jump++;
                end=farthest;
            }
        }
        return jump;
    }

}
