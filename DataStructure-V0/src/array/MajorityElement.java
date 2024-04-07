package array;

public class MajorityElement {

    public static void main(String[] args) {

        int [] arr = {1,1,3,3,2};
        int possible_candidate = checkForMajority(arr);
        System.out.println("possible_candidate "+possible_candidate);
        int candidate_votes = 0;
        for(int vote:arr){
            if(vote == possible_candidate)
                candidate_votes++;
        }
        if(candidate_votes>arr.length/2){
            System.out.print("majority element "+possible_candidate);
        }
        else
            System.out.print("no majority element found");

    }

    private static int checkForMajority(int[] arr) {
        int candidate = arr[0];
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] == candidate){
                count ++;
            }else{
                count --;
            }
            if(count == 0){
                candidate = arr[i];
                count = 1;
            }
        }
        return candidate;
    }
}
