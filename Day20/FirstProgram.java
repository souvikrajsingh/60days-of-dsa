package com.souvik.Day20;

public class FirstProgram
{
    private static int  average(int p, int q) {
        int avg= (p+q)/2;
//        System.out.println("average: " + avg);
        return avg;
    }

    private static void sum(int a, int b) {
        int result=a+b;
        System.out.println("sum :  "  + result);
    }

    public static void main(String[] args) {
        int a=5;
        int b=10;
        sum(a,b);

        int k=average(a,b);
        System.out.println("average: "  + k);


    }

}
