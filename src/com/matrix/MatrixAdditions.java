package com.matrix;

import java.util.Arrays;

public class MatrixAdditions {
    public static void main(String[] args) {
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};
        int sum [][] = new int[3][3];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Sum :"+ Arrays.deepToString(sum));
    }
}
