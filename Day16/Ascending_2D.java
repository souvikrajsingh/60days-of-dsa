package com.souvik.Day16;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending_2D {
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
        arrangeinAsc(arr,rows,cols);
    }
    static void arrangeinAsc(int[][] arr, int rows, int cols)
    {
        int[] array=new int[rows*cols];
        int c=0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[c]=arr[i][j];
                c=c+1;
            }
        }
        System.out.println("Single Dimensional array: " + Arrays.toString(array));
        insertionsort(array);
        System.out.println("Single Dimensional Array After Sorting: " + Arrays.toString(array));
    }

    private static void insertionsort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if (array[j] < array[j-1]) {
                    swap(array,j,j-1);
                }
                else
                {
                    break;
                }

            }
        }

    }

    private static void swap(int[] array, int j, int i) {
        int temp=array[j];
        array[j]=array[j-1];
        array[j-1]=temp;
    }
}
