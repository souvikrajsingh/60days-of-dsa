package com.souvik.Day16;

import java.util.Scanner;

public class ProductEachcol {
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
        product_of_each_row(arr, rows, cols);
    }
    static void product_of_each_row(int[][] arr, int rows, int cols)
    {
        int pro=1;
        int r=0;
        for(int j=0;j<rows;j++) {
            for (int i = 0; i < cols; i++) {
                pro = pro * arr[r][i];
            }
            System.out.println("sum of row "  + r + " is :" + pro);
            pro=1;
            r = r + 1;
        }

    }
}
