package com.souvik.Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>(size);
        int[] arr=new int[size];
//        int[] rm=new int[size];
        int c=0;
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }

       /*

       for(int i=0;i<size-1;i++)
        {
                if(arr[i]!=arr[i+1])
                    {
                        rm[c]=arr[i];
                        c=c+1;
                    }
        }
        rm[c]=arr[size-1];

        */

        for(int i=0;i<size-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
               list.add(arr[i]);

            }
        }
        list.add(arr[size-1]);
        System.out.println("Sorted Array: " + list);

        /*

        System.out.println("For Sorted Array : ");
        for(int i=0;i<rm.length;i++)
        {
            System.out.print(rm[i]);
        }
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j]&&i!=j) {
                    list.add(arr[j]);
                }
                else
                {
                    list.add(arr[j] );
                }
            }
        }
        System.out.println("After Removing Duplicates: " + list);*/
    }
}
