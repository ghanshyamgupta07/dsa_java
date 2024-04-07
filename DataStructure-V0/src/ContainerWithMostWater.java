package array;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = {2, 3, 4, 5, 18, 17, 6};
        System.out.print(containerWithMostWater_optimized(height));
        System.out.println();
        System.out.print(containerWithMostWater(height));
        System.out.println();
        System.out.println(containerWithMostWater_(height));

    }

    private static int containerWithMostWater_(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        while (left < right) {
            // Calculating the max area
            area = Math.max(area,
                    Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right])
                left += 1;
            else
                right -= 1;
        }
        return area;
    }


    private static int containerWithMostWater(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return max;
    }


    private static int containerWithMostWater_optimized(int[] height) {

        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) left++;
            else right--;
        }

        return max;

    }

}
