package com.souvik.Day28;

//https://leetcode.com/problems/kth-missing-positive-number/

import java.util.ArrayList;

public class LC_1539_MissingKthNumber {

    public static void main(String[] args) {

        int [] arr = { 2,3,4,7,11};
        int k=5;
        System.out.println(findKthPositive(arr,k));

    }

    public static  int findKthPositive(int[] arr, int k) {

        for(int i=0;i<arr.length;i++) {
            if(arr[i]<=k) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }

}
