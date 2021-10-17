package com.souvik.Day34;

//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class Pattern_32_33_34 {
    public static void main(String[] args) {

        pattern32(5);
        pattern33(5);
        pattern34(5);

    }
    static void pattern32(int n) {

        /*
        E
        ED
        EDC
        EDCB
        EDCBA*/

        for (int i = 69; i>=65 ; i--) {
            for (int j = 69; j>= i ; j--) {
                System.out.print((char)j);
            }
            System.out.println();
        }
    }

    static void pattern33(int n) {

        /*
       a
       B c
       D e F
       g H i J
       k L m N o*/

        int k = 65;
        int small = 97;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (k % 2 == 0) {
                    System.out.print((char) k + " ");
                    k = k + 1;
                    small++;
                } else {

                    System.out.print((char) small + " ");
                    small++;
                    k = k + 1;
                }
            }
            System.out.println();
        }
    }

    static void pattern34(int n) {
        /*
       E D C B A
       D C B A
       C B A
       B A
       A
       */
        System.out.println();
        int p = 69;
        for (int i = 1; i <= 5 ; i++) {
            int k = p;
            for (int j = 5; j >=i ; j--) {

                System.out.print((char) k + " ");
                k=k-1;
            }
            p=p-1;
            System.out.println();
        }
    }
    }
