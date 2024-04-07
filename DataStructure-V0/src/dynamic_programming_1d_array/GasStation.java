package dynamic_programming_1d_array;

class GasStation {
    public static void main(String[] args) {
        int gas [] = {1,2,3,4,5};
        int [] cost = { 3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {

        int total = 0 ; int ind = 0; int temp_sum = 0;
        for(int i=0;i<gas.length;i++){
            temp_sum += gas[i] - cost[i];
            if(temp_sum<0){
                total += temp_sum;
                temp_sum = 0;
                ind = i+1;
            }
        }
        total += temp_sum; // temp_sum might having something
        return total<0 ? -1 : ind ;

    }
}
