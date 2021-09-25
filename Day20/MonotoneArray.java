package com.souvik.Day20;


//https://leetcode.com/problems/monotonic-array/

public class MonotoneArray {

    public static void main(String[] args) {

        int[] array= { 1,2,2,3};
        boolean ans=monontone(array);
        if(ans)
        {
            System.out.println("Monotone Array");
        }
        else
        {
            System.out.println("Not Monontone Array");
        }

    }
    public static boolean monontone(int[] array )
    {
        boolean increasing= true;
        boolean decreasing= true;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1]) {
                increasing=false;
            }
            else if(array[i]< array [ i+1])
            {
                decreasing= false;
            }

        }
        return increasing || decreasing;
    }
}
