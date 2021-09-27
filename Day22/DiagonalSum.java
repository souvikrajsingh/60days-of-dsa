package com.souvik.Day22;

import java.util.Arrays;

public class DiagonalSum {
    public static void main(String[] args) {

        /*int[][] mat = {{1,2,3},
                {4,5,6},
                {7,8,9} };*/

        int[][] mat = {{1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},{1,1,1,1}
        };
        System.out.println(mat.length);
        for (int i = 0; i < mat.length; i++) {
            {
                for (int j = 0; j < mat.length; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
        }

        int sum=diagonalSum(mat);
        System.out.println("Sum :  " + sum);

    }
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if((i==j)||((i+j)== mat.length-1))
                {
                    sum=sum+mat[i][j];
                }
            }
        }
        return sum;
    }
}
