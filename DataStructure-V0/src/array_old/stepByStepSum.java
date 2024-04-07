package array_old;

public class stepByStepSum {
public static void main(String[] args) {

    int [] arr = {-4,-1,1,-5,-4,5,5 };
    int res = minStartValue(arr);
    System.out.println(res);
    
}   

public static int minStartValue(int[] nums) {
    int minStart=0;
    int sum = 0;
    for(int num:nums){
        
        sum += num;
        if(sum<1){
           int needs = sum*(-1)+1;
           minStart+= needs;
           sum += needs;
        }
    }
  
    return minStart>0?minStart:1;
}

}
