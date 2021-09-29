package com.souvik.Day24;

public class CheckMathFunctions {
    public static void main(String[] args) {

        int a=12;
        System.out.println(a<<1); //returns double the value of a i.e, 24

//        a<<b = a*(2^b);

        int b=12;
        System.out.println(b>>1);

        System.out.println((b&1)==1);
//        n&1 == 1 , then its odd else its even.

        int[] arr= { 2,4,6,3,4,3,2};
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num=num^arr[i];
        }
        System.out.println(num);

    }

}
