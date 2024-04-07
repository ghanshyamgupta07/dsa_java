package array_2D;

import java.util.Arrays;

public class SetZeros {
    public static void main(String[] args) {
        int [][] arr = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        setZeroes(arr);
    }
    public static void setZeroes(int[][] matrix) {

        BasicOps.print(matrix);
        boolean [] rows_for_zeros = new boolean[matrix.length];
        boolean [] cols_for_zeros = new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rows_for_zeros[i] = true;
                    cols_for_zeros[j] = true;
                }
            }
        }

        System.out.println(Arrays.toString(rows_for_zeros));
        System.out.println(Arrays.toString(cols_for_zeros));

        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(rows_for_zeros[i] || cols_for_zeros[j]){
                    matrix[i][j]=0;
                }
            }
        }
        BasicOps.print(matrix);
    }
}
