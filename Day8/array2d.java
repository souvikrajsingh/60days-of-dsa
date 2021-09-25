package com.souvik.Day8;

import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int row= sc.nextInt();
        System.out.println("Enter the Columns: ");
        int cols= sc.nextInt();
        int rowsum=0;
        int[][] arr=new int[row][cols];
        System.out.println("Enter the elements in " + row + " X " + cols  + " matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
               arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Input: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                rowsum=rowsum+arr[i][j];
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("sum of row " + i + ": " + rowsum);
            System.out.println();
        }
    }
}
