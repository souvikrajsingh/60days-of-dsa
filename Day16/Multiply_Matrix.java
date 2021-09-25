package com.souvik.Day16;

import java.util.Scanner;

public class Multiply_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the first array: ");
        int rows1 = sc.nextInt();
        System.out.println("Enter the number of cols in the first array: ");
        int cols1 = sc.nextInt();
        
        System.out.println("Enter the number of rows in the second array: ");
        int rows2 = sc.nextInt();
        System.out.println("Enter the number of cols in the second array: ");
        int cols2 = sc.nextInt();
        
        int[][] arr1= new int[rows1][cols1];
        int[][] arr2 = new int[rows2][cols2];
        
        System.out.println("Enter  elements in the matrix 1: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                arr1[i][j] = sc.nextInt();
            }
            System.out.println();

        }
        
        System.out.println("Enter  elements in the matrix 2: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                arr2[i][j] = sc.nextInt();
            }
            System.out.println();

        }
        int[][] arr3=new int[rows1][cols2];

        
        
    }
}

