package com.souvik.Day6;

import java.util.Scanner;

public class Sumofelements
{
    public static void main(String[] args)
    {
        int[] arr=new int[10];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements in the array: ");
        for(int i=0;i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int i=0;i< arr.length;i++)
        {
            sum=sum + arr[i];
        }
        System.out.println("Sum: " + sum);
    }
}
