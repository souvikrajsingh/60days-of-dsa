package com.souvik.Day16;

import java.util.Scanner;

public class array_2d {
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
        int sum=sum_array(arr,rows, cols);
        System.out.println("Sum of all elements in the matrix : " + sum);
    }
    static int sum_array(int[][] arr, int rows, int cols)
    {
        int sum=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum=sum+arr[i][j];
            }
        }
        return sum;
    }
}
