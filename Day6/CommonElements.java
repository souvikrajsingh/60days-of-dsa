package com.souvik.Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElements
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {

        System.out.println("Enter the size of the array 1: ");
        int s1 = sc.nextInt();
        System.out.println("Enter the size of the array 2: ");
        int s2 = sc.nextInt();

        int[] a1 = new int[s1];
        int[] a2 = new int[s2];
//        List Initialisation
        ArrayList<Integer> list =new ArrayList<>(s1);

        System.out.println("Enter the elements in a1 : ");
        for (int i = 0; i < s1; i++)
        {
            a1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements in a2: ");
        for (int i = 0; i < s2; i++) {
            a2[i] = sc.nextInt();
        }

        System.out.println("a1: " + Arrays.toString(a1));
        System.out.println("a2: " + Arrays.toString(a2));

//        System.out.println("Common Elements: ");
        for (int i = 0; i < a1.length; i++)
        {
            for (int j = 0; j < a2.length; j++)
            {
//                if it founds common elements its saving it in a list . A list is an Array with no size bound
                if (a1[i]==(a2[j]))
                {
                    list.add(a1[i]);
                }
            }
        }
//        printing common element stored in the array list.
        System.out.println("Common elements: " + list);
    }
}







