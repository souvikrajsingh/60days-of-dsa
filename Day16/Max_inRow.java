package com.souvik.Day16;

import java.util.Scanner;

public class Max_inRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter  elements in the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {
            maxinrow(arr,i,cols);
        }

    }
    static void maxinrow(int [][] arr, int i, int cols)
    {
        int max=arr[i][0];
        for (int j = 0; j < cols; j++) {
            if(arr[i][j]>max)
            {
                max=arr[i][j];
            }
        }
        System.out.println("Max in Row no: " + i + " is " + max) ;
    }
}
