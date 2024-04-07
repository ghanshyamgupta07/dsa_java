package array_old;

public class TrappingRainWater {

    public static void main(String[] args) {

        int [] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int res = MaxTrappedRainWater(arr);
        System.out.print(res);
    }

    private static int MaxTrappedRainWater(int[] height){

       int temp[] = new int[height.length];
       int left_max_so_far = height[0];
       for(int i=1;i<height.length;i++){
           temp[i] = left_max_so_far;
           left_max_so_far = Math.max(left_max_so_far,height[i]);
       }


        int right_max_so_far = height[height.length-1];
        temp[temp.length-1] = 0;
        for(int i=height.length-2;i>=0;i--){
            temp[i] = Math.min(temp[i],right_max_so_far);
            right_max_so_far = Math.max(right_max_so_far,height[i]);
        }

        for(int i: temp){
            System.out.print(i+" ");
        }


        int maxWater = 0;
        for(int i=1;i<height.length-1;i++){
            if(temp[i]-height[i]>0)
            maxWater = maxWater + temp[i] - height[i];
        }

     return maxWater;
    }

    private static int MaxTrappedRainWater2(int[] heights){

        int left = 0, right = heights.length - 1, water = 0;

        int maxLeft = heights[left];
        int maxRight = heights[right];

        while (left < right)
        {
            if (heights[left] <= heights[right])
            {
                left++;
                maxLeft = Integer.max(maxLeft, heights[left]);
                water += (maxLeft - heights[left]);
            }
            else {
                right--;
                maxRight = Integer.max(maxRight, heights[right]);
                water += (maxRight - heights[right]);
            }
        }

        return water;
    }

}
