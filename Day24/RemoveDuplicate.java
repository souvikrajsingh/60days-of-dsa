package com.souvik.Day24;

public class RemoveDuplicate {
    public static void main(String[] args) {

        int[][] arr = {{ 1,3,2},
                {5,2,1},
                {3,4,4}};

        int num=0;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                num = num ^ anInt;
            }
        }
        System.out.println(num);
    }
}
