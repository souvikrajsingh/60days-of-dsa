package com.souvik.Day25;

//power to check if a number is power of 2

public class PowerOfTwo {
    public static void main(String[] args) {

        int n=17;
        boolean ans= (n&(n-1)) ==0;
        System.out.println(ans);

    }
}
