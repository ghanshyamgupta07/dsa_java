package dynamic_programming;

public class CountSubsetforGivenDiff {

    public static void main(String[] args) {

        int [] arr = {1,2,2,3};
        int diff = 1;

        // s1 + s2 = S
        // s1 - s2 = diff
        // s1 =  (S+diff)/2 we need count subsets with sum (S+diff)/2

        int sum = 0;
        for(int a: arr) sum+=a;

        int cnt = CountSubSetSumForX.countSubSetSumForX(arr,(sum+diff)/2,arr.length);
        System.out.println(cnt);

    }
}
