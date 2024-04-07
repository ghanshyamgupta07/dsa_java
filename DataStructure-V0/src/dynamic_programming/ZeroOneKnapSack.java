package dynamic_programming;

public class ZeroOneKnapSack {
    public static void main(String[] args) {

        int [] weight = {1,2,4,5,7,8};

        int [] value = {2,4,7,9,12,14};
        int W = 14;

        int res1 = zeroOneKnapSackRecursive(weight,value,W,weight.length);
        int res2 = zeroOneKnapSack(weight,value,W,weight.length);

        System.out.print(" recursive "+res1 + " top down "+res2);

    }

    private static int zeroOneKnapSackRecursive(int [] weight,int value[] , int W, int n){

        // base case
        if(n==0 || W==0)
            return 0;

        //
        if(weight[n-1]<=W){
         return Math.max(value[n-1]+zeroOneKnapSackRecursive(weight,value,W-weight[n-1],n-1),
                                    zeroOneKnapSackRecursive(weight,value,W,n-1));
        }else{
          return  zeroOneKnapSackRecursive(weight,value,W,n-1);
        }
    }

    private static int zeroOneKnapSack(int [] weight,int value[] , int W, int n){

        int [][] T = new int[n+1][W+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){

                if(weight[i-1]<=j){
                    T[i][j] = Math.max(value[i-1]+T[i-1][j-weight[i-1]],
                            T[i-1][j]);
                }else{
                    T[i][j] = T[i-1][j];
                }

            }
        }

        return T[n][W];


    }

}
