package com.souvik.Day32;

import java.util.Scanner;

//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class PatternContinued18_28 {

    public static void main(String[] args) {

        pattern18(5);

    }

    static void pattern18(int n) {

        for (int rows = 0; rows < n; rows++) {

//            for (int cols = rows; cols < n ; cols++) {
//
//                System.out.print("*");
//            }

            for (int spaces = 0; spaces <= rows; spaces++) {

                System.out.print(" ");

            }
            for (int cols = rows; cols < n; cols++) {

                System.out.print("*");
            }

            System.out.println();
        }


    }

    static void pattern28(int n) {
        for (int row = 0; row < (2 * n); row++) {

            int totalColumns = row > 5 ? (2 * n - row) : row;
            int totalSpaces = (n - totalColumns);

            for (int spaces = 0; spaces < totalSpaces; spaces++) {
                System.out.print(" ");
            }

            for (int cols = 0; cols < totalColumns; cols++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}