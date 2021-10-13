package com.souvik.Day32;

public class pattern17 {
    public static void main(String[] args) {

        pattern17(4);
    }
    static void pattern17 ( int n)
    {
        for (int rows = 1; rows <= n; rows++) {

            for (int spaces = 0; spaces < ( n - rows); spaces++) {
                System.out.print(" ");
            }
            for (int cols = rows; cols >= 1 ; cols--) {

                System.out.print(cols);
            }
            for (int cols = 2; cols <= rows ; cols++) {
                System.out.print(cols);
            }
            System.out.println();
        }
    }
}
