package com.souvik.Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Duplicate_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int c = 0;
        ArrayList<Integer> list =new ArrayList<>(size);
        int[] arr = new int[size];
        System.out.print("Enter the elements in the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input: " + Arrays.toString(arr));

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j] && i != j) {
                    list.add(arr[j]);
                }
            }
        }
        System.out.println("Duplicate Elements : " + list);
    }
}