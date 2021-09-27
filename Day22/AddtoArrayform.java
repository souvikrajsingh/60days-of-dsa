package com.souvik.Day22;

//https://leetcode.com/problems/add-to-array-form-of-integer/

//84/156 test cases passed

import java.util.*;

public class AddtoArrayform {

    public static void main(String[] args) {
        int[] num = { 9,9,9,9,9,9,9,9,9,9};
        int k=1;
        List<Integer> list=new ArrayList<Integer>();
        list=addToArrayForm(num,k);
        System.out.println(list);
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        /*
        Input: num = [1,2,0,0], k = 34
        Output: [1,2,3,4]
        Explanation: 1200 + 34 = 1234
        */
        int number=0;int rem;
        List<Integer> list=new ArrayList<Integer>(num.length+1);
        for (int i = 0;i <num.length;i++) {
            number=(number*10)+num[i];
        }
        System.out.println("number : "  + number);
        k=k+number;
        System.out.println("k : "  + k);
        while(k>0)
        {
            list.add(0,(k%10));
            k=k/10;
        }
        return list;
    }

}
