package com.souvik.Day23;

//https://leetcode.com/problems/transpose-matrix/

import java.util.Arrays;


public class Transpose {
    public static void main(String[] args) {

        int [][] matrix = {{1,2,3}, { 4,5,6}};
        /*System.out.println("Matrix: ");
        System.out.println(Arrays.toString(matrix));*/

        int[][] trans=transpose(matrix);
        System.out.println("Transpose : ");

        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[i].length; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static int[][] transpose(int[][] matrix) {

        int [][] trans =new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length; j++) {
                trans[j][i]=matrix[i][j];
            }
        }
        return trans;
    }
}
    /*int M = matrix.length; int N = matrix[0].length;
        int[][] B = new int[N][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                B[j][i] = matrix[i][j];
            }
        }

        return B;;*/