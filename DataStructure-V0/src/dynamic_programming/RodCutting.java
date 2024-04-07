package dynamic_programming;

public class RodCutting {
    public static void main(String[] args) {

        int [] length = { 1,2,3,4, 5, 6 ,  7 ,  8  };
        int [] price = { 3 ,  5,   8,   9 , 10 , 17,  17,  20};
        int N = 18;

        int res1 = rod_cutting_recursive(length,price,N,price.length);
        int res2= rod_cutting(length,price,N,price.length);

        System.out.print("recursive "+res2 + " top down "+res1);



    }

    private static int rod_cutting_recursive(int [] length, int [] prices , int L , int n){

        if(L==0 || n ==0) return 0;

        if(length[n-1]<=L){
            return  Math.max(prices[n-1]+rod_cutting_recursive(length,prices,L-length[n-1],n),
                                         rod_cutting_recursive(length,prices,L,n-1));
            }
        else{
            return rod_cutting_recursive(length,prices,L,n-1);
        }
    }

    private static int rod_cutting(int [] length, int [] prices , int L , int n){

        int T[][] = new int[n+1][L+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=L;j++){

                if(length[i-1]<=j){
                   T[i][j] =  Math.max(prices[i-1]+T[i][j-length[i-1]],
                                  T[i-1][j]);
                }
                else{
                    T[i][j] = T[i-1][j];
                }

            }
        }

      return T[n][L];
    }

}
