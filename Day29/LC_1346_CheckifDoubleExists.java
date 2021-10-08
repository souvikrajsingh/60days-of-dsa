package com.souvik.Day29;

//https://leetcode.com/problems/check-if-n-and-its-double-exist/

public class LC_1346_CheckifDoubleExists {

    public static void main(String[] args) {

        int[] arr = {-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {

        for(int i= 0 ; i< arr.length;i++)
        {
            if(i == (arr.length -1))
            {
                for(int j = 0; j< arr.length -1 ;j++)
                {
                    if(arr[i]==(2*arr[j]))
                    {
                        return true;
                    }
                }
            }
            else
            {
                for(int j = 0; j < arr.length ; j++)
                {
                    if(arr[i] ==(2*arr [j]))
                    {
                        return true ;
                    }
                }
            }
        }
        return false;
    }
}

