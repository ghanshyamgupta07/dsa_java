package array_old;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {

    // int [] nums = {2,0,2,1,1,0};
    int [] nums1 = {1,2,0};
    int [] nums2 = {1,2,0};
    sortColors(nums1);
    sort012(nums2,nums2.length);
    System.out.println(Arrays.toString(nums1));
    System.out.println(Arrays.toString(nums2));

    }


    private static void sort012(int a[], int arr_size)
    {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {

                if(a[mid] == 0) {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;

                }
            else if(a[mid] == 1) {
                    mid++;
            }
            else if(a[mid] == 2) {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;

                }
            }

    }

    public static void sortColors(int[] nums) {

        int i=0; int j=0; int k=nums.length-1;
        while(j<=k){

            if(nums[j] == 0){
                nums[j++] = nums[i];
                nums[i++] = 0;
            }else if(nums[j] == 2){          // {0,0,2,1,1,2};

                nums[j] = nums[k];
                nums[k--] = 2;
            }else if(nums[j] == 1){
                j++;
            }





        }



    }
}
