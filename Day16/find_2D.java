package com.souvik.Day16;

import java.util.Scanner;

public class find_2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols=sc.nextInt();

        int[][] arr=new int[row][cols];

        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number you want to search:  ");
        int search=sc.nextInt();
        find(arr,row,cols,search);
    }
    static void find(int[][] arr, int row, int cols, int search)
    {
            int r=0,c=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if(arr[i][j]==search)
                {
                     r=i;
                    c=j;
                    break;
                }
            }
        }
        System.out.println("Element found at: " + r+c);

    }
}
