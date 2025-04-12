package com.matrix;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};
        int multi [][] = new int[b.length][a.length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                multi[i][j] = 0;
                for(int k = 0; k < multi.length; k++){
                    multi[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiplication of matrix: "+ Arrays.deepToString(multi));
    }
}
