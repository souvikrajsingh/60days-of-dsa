package com.souvik.Day6;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args)
    {
        int[] arr=new int[5];
        int i,target,pos=0;
        Scanner sc=new Scanner( System .in );
        System.out.println("Enter the elements in the array: ");
        for(i=0;i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Entered Elements: ");
        for(int element: arr)
        {
            System.out.print(element + " ");
        }
        System.out.println("Enter the search elements : ");
        target= sc.nextInt();

         for(i=0;i< arr.length;i++)
        {
            if(target==arr[i])
            {
                pos=i+1;
                break;
            }
        }
        /*for(int s:arr)
        {
            if(target==s)
            {
                pos=i;
                break;
            }
        }*/
        System.out.println("Element found at : " + (pos));
    }
}
