package array_old;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        int [] arr1 =  {4,7,9,7,6,7};
        int [] arr2 = {5,0,0,6,1,6,2,2,4};



        int [] res = intersect(arr2,arr1);

        for(int a : res)
            System.out.println(a+" ");

    }
    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer,Integer> countMap1 = new HashMap<>();
        Map<Integer,Integer> countMap2 = new HashMap();

        List<Integer> commonList = new ArrayList<>();

        for(int e: nums1){
            if(countMap1.containsKey(e)){
                countMap1.put(e,countMap1.get(e)+1);
            }else{
                countMap1.put(e,1);
            }

        }

        for(int e: nums2){
            if(countMap2.containsKey(e)){
                countMap2.put(e,countMap2.get(e)+1);
            }else{
                countMap2.put(e,1);
            }

        }


        for(Map.Entry<Integer,Integer> entry: countMap1.entrySet()){

            if(countMap2.containsKey(entry.getKey())){
                int cnt = Math.min(countMap2.get(entry.getKey()),entry.getValue());
                for(int j=1;j<=cnt;j++){
                    commonList.add(entry.getKey());
                }
            }
        }


        int [] res = new int[commonList.size()];
        int i=0;
        for(int e: commonList) {
            res[i++] = e;
        }
        return res;



    }
}
