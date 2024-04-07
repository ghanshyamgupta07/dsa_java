package two_pointers;

public class TrappingRainWater {

    public static void main(String[] args) {

        int [] arr = {4,2,0,3,2,5};

        int res = MaxTrappedRainWater(arr);
        System.out.print(res);
    }

    private static int MaxTrappedRainWater(int[] height){

       int i = 0; int j = height.length-1;
       int left_max = 0;
       int right_max = 0;

       int water = 0;

       while (i<=j){
           if(right_max<=left_max){
             water+= Math.max(0,right_max-height[j]);
             right_max = Math.max(right_max,height[j]);
             j--;
           }else{
               water+= Math.max(0,left_max-height[i]);
               left_max = Math.max(left_max,height[i]);
               i++;
           }
       }
       return  water;
    }
}
