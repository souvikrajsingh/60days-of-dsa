package com.souvik.Day22;

import java.util.Arrays;

public class SumZero {
    public static void main(String[] args) {
        int n=5;
        int [] arr=new int[5];
        arr=sumZero(n);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] sumZero(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n - 1; i += 2) {
            result[i] = i + 1;
            result[i + 1] = -(i + 1);
        }
        return result;
    }
}
