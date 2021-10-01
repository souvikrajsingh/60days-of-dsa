package com.souvik.Day25;

public class NoOfDigits {

    public static void main(String[] args) {

        int n=369;
        int base=10;

        int noofdigit= (int) (Math.log(n) / Math.log(base)) + 1;

        System.out.println(noofdigit);


    }
}
