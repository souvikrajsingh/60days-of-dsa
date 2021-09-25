package com.souvik.Day16;

import java.util.Scanner;

public class Elements_belowRightD {
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
        elements_below_right_diagonal(arr, rows, cols);
    }
    static void elements_below_right_diagonal(int[][] arr, int rows, int cols)
    {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <cols ; j++) {
                if((i+j)>=rows)
                {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
