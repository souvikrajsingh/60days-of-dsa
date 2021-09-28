package com.souvik.Day23;

//https://leetcode.com/problems/set-matrix-zeroes/

public class SetZeroMatrix {
    public static void main(String[] args) {

        int[][] matrix = { { 0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}};

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print( anInt+ " ");
            }
            System.out.println();
        }

        setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {

        int row = 0,col= 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]==0)
                {
                    row=i;
                    col=j;
                    break;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i==row)
                {
                    matrix[row][j]=0;
                }
                else if(j==col)
                {
                    matrix[i][col]=0;
                }
            }
        }

        System.out.println("Array after making required changes: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
