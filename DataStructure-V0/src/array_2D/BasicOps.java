package array_2D;

import java.util.Random;

public class BasicOps {
    public static int[][] create(int m, int n) {
        Random rand = new Random();
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }
        return arr;
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void traverse(int[][] arr, boolean row_order) {
        if (row_order) { // row order
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print(" ");
            }
        } else { // column order
            for(int i = 0; i < arr[0].length; i++) {
                for(int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i] + " ");
                }
                System.out.print(" ");
            }
        }
    }

    public static void printDigonals(int[][] arr) {
        System.out.print(" printing main digonal");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.print(" printing sec digonal: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i + j == arr.length - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void printAboveBelowMainDigonals(int[][] arr) {
        System.out.print(" printing elements above main digonal");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i<=j) {
                    System.out.print(arr[i][j] + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.print(" printing element belpw main digonal: ");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i>=j) {
                    System.out.print(arr[i][j] + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void printIndexes(int[][] arr) {
        System.out.print("printing indexes: ");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i + j > arr.length - 1) {
                    System.out.print(arr[i][j]+ " ");
                }


            }
            System.out.println();
        }
    }



}
