package com.souvik.Day19;

import java.util.Arrays;
import java.util.Scanner;

public class Revision
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int [] arr1= { 4,10,2,1,9,3,15,10,13,29,21,11};
        int [] arr2= { 9,1,4,3,10,4,25,19,17,13,15,0,-7};
        merge(arr1,arr2);
        /*System.out.println("Enter the search element: ");
        int target= sc.nextInt();
        bubblesort(arr);
        System.out.println("From bubble Sort" + Arrays.toString(arr));
        int k=binarysearch(arr,target);
        if(k==-1)
        {
            System.out.println("Element not found  ");
        }
        else
        {
            System.out.println("Element found at : " + (k+1));
        }*/
        /*insertionsort(arr);
        System.out.println("From insertion Sort" + Arrays.toString(arr));*/

        /*int pos=linearsearch(arr,target);
        System.out.println(target + " found at : " + (pos+1));*/

    }

    static void merge(int [] arr1, int arr2[])
    {
        int [] arr3 = new int[arr1.length+ arr2.length];
        int k=0;
        for (int i = 0; i < arr1.length + arr2.length; i++) {
            if(i<arr1.length)
            {
                arr3[i]=arr1[i];
            }
            else
            {
                arr3[i]=arr2[k];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    static int linearsearch(int [] arr, int target)
    {
        int i;
        for (i = 0; i < arr.length; i++) {
            if(arr[i]==target)
            {
                break;

            }
        }
        return i;
    }

    static int binarysearch(int [] arr, int target)
    {
        int s=0;
        int e=arr.length-1;
        while(s<=e) {
            int m=s+(e-s)/2;
            if (arr[m] == target) {
                return m;
            } else if (arr[m] < target) {
                s = m + 1;
            } else if (arr[m] > target) {
                e = m - 1;
            }
        }
        return -1;

    }

    static void bubblesort(int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped=false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }

        }
    }

    static void insertionsort(int [] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else
                {
                    break;
                }

            }

        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp=arr[j];
        arr[j]=arr[j-1];
        arr[j-1]=temp;
    }
}
