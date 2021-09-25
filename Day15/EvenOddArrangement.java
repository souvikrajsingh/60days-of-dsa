package com.souvik.Day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EvenOddArrangement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the element: ");
        int s = sc.nextInt();
        int[] arr = new int[s];
        ArrayList<Integer>list1=new ArrayList<>(s);
        ArrayList<Integer>list2=new ArrayList<>(s);
        ArrayList<Integer>final_list=new ArrayList<>(s);
        int c = 0;
        int e = s;
        System.out.println("Enter elements in the array of size " + s);
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array: " + Arrays.toString(arr));

//      arranging the array

        bubblesort(arr);
        System.out.println("After arranging in ascending order: " + Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 0) {
                list1.add(arr[i]);
            } else {
                list2.add(arr[i]);
            }
        }
        final_list.addAll(list1);
        final_list.addAll(list2);

        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println("final_list: " + final_list);

    }

    static void bubblesort(int[] arr) {
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
            // if you did not swap for a particular value of i, it means the array is sorted
            if (!swapped) //!false=true;
            {
                break;
            }
        }
    }
}
