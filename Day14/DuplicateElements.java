package com.souvik.Day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the first array: ");
        int size1 = sc.nextInt();
        System.out.println("Enter the number of element in the second array: ");
        int size2 = sc.nextInt();

        int[] arr1 = new int[size1 + size2];
        int[] arr2 = new int[size2];
        int[] arr3 = new int[size1 + size2];
        int c = 0;
//        ArrayList<Integer>list=new ArrayList<>(size1+size2);

        System.out.println("Enter elements in the first array: ");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements in the second array: ");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

//        Merging arrays

        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                arr1[size1 + j] = arr2[j];
            }
        }

        sortarrays(arr1);
        System.out.println("Merged and sorted Array : " + Arrays.toString(arr1));

        removeduplicate(arr1);

    }

    static void sortarrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    static void removeduplicate(int[] arr) {
        int[] a=new int[arr.length];
        int c=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                a[c]=arr[i];
                c=c+1;
            }
            else
            {
                a[c]=arr[i];
                c=c+1;
            }
            System.out.println("Merged Sorted and Removed Duplicates: " + Arrays.toString(a));
        }
    }
}

