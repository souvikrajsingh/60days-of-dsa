package com.souvik.Day10.Revision;

import java.util.Arrays;
import java.util.Scanner;

//Two sum II - Input array is sorted
public class LC_167 {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System .in);
        System.out.println("Enter the size of the array : ");
        int s= sc.nextInt();
        int [] arr =new int[s];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i< arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the target : ");
        int target= sc.nextInt();
        int [] k =sumofelements(arr,target);
        System.out.println("Required elements" + Arrays.toString(k));

    }
    public static int[] sumofelements(int [] arr , int target)
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]+arr[j])==target)
                {
                    return new int[] {i,j};
                }

            }
        }
        return new int[] { -1,-1};
    }

}
