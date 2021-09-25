package com.souvik.Day5;

import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the lower point : ");
        int low = sc.nextInt();
        System.out.print("Enter the higher point : ");
        int high = sc.nextInt();
        System.out.println("Enter the elements in a array: ");
        for (int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }

    }
}

