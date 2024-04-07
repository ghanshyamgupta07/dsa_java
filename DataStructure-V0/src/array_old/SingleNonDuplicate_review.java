package array_old;

public class SingleNonDuplicate_review {
    public static void main(String[] args) {
        int [] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
        System.out.println(singleNonDuplicateOpt(nums));
    }

    public static int singleNonDuplicate(int[] nums) {

      int res = 0;
      for(int num:nums)
          res = res ^ num;

       return res;
    }

    public static int singleNonDuplicateOpt(int[] nums) {

        return find(nums,0,nums.length-1);

    }

    private static int find(int[] nums , int low , int high){

        if(low<=high){
            int mid = low + (high-low)/2;
            boolean condition1 = (mid == 0 && nums[mid] != nums[mid+1]);
            boolean condition2 = (mid == (nums.length-1) && nums[mid] != nums[mid-1]);
            boolean condition3 = (nums[mid] !=nums[mid+1] && nums[mid] !=nums[mid-1]);

            if(mid>0 && mid<high && (condition1 || condition2 || condition3))
                return nums[mid];
            find(nums,low,mid-1);
            find(nums,mid+1,high);
        }
        return -1;
    }

//    private static int find(int[] nums , int low , int high){
//
//        if(low<=high){
//            int mid = low + (high-low)/2;
//
//            if(mid == 0 && nums[mid] != nums[mid+1]){
//                return nums[mid];
//            } else if(mid == (nums.length-1) && nums[mid] != nums[mid-1]){
//                return nums[mid];
//            }else if(nums[mid] !=nums[mid+1] && nums[mid] !=nums[mid-1]){
//                return  nums[mid];
//            }
//            find(nums,low,mid-1);
//            find(nums,mid+1,high);
//
//        }
//
//        return -1;
//    }


    class Solution {
        public int singleNonDuplicate(int[] nums) {
            if (nums == null || nums.length == 0) { return 0; }
            int ans = 0;
            for (int num: nums) {
                ans ^= num;
            }
            return ans;
        }
    }

    public int singleNonDuplicate_bsearch(int[] nums) {
            int lo = 0;
            int hi = nums.length - 1;
            while (lo < hi) {
                int mi = lo + (hi - lo) / 2;
                if (mi % 2 == 1) mi--;

                if (nums[mi] != nums[mi + 1]) {
                    // We didn't find a pair. The single element must be on the left.
                    // (pipes mean start & end)
                    // Example: |0 1 1 3 3 6 6|
                    //               ^ ^
                    // Next:    |0 1 1|3 3 6 6
                    hi = mi;
                } else {
                    // We found a pair. The single element must be on the right.
                    // Example: |1 1 3 3 5 6 6|
                    //               ^ ^
                    // Next:     1 1 3 3|5 6 6|
                    lo = mi + 2;
                }
            }
            return nums[lo];
        }


}
