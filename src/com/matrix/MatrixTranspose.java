package com.matrix;

import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int original[][] = {
                {1, 3, 4},
                {2, 4, 3},
                {3, 4, 5}};
        int transpose[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        System.out.println("Matrix Transpose: "+ Arrays.deepToString(transpose));
    }
}
