package com.souvik.Day16;

import java.util.Scanner;

public class Diagonal_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows= sc.nextInt();
        System.out.println("Enter the number of cols: ");
        int cols= sc.nextInt();
        int[][] arr=new int[rows][cols];
        System.out.println("Enter  elements in the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        diagonalzero(arr,rows,cols);
    }
    static void diagonalzero(int[][] arr, int rows, int cols)
    {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(i==j || ((i+j)==(rows-1)))
                {
                    arr[i][j]=0;
                }
            }
        }
        System.out.println("Matrix after modification: ");
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
