package com.souvik.Day32;

public class Pattern20 {
    public static void main(String[] args) {

        /*pattern20(5);
        pattern21(5);
        pattern22(5);
        pattern26(6);*/
        pattern27(4);
    }

    static void pattern20(int n) {
        for (int rows = 0; rows < n; rows++) {

            for (int cols = 0; cols < 5; cols++) {

                if (rows == 0 || rows == (n - 1)) {
                    System.out.print("*");
                } else if (cols == 0 || cols == (n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern21(int n) {
        int c = 1;
        for (int rows = 1; rows <= 5; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(c + " ");
                c = c + 1;
            }
            System.out.println();

        }
    }

    static void pattern22(int n) {
    }

    static void pattern26(int n) {
        /*
      1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6*/

        int c = 1;
        for (int rows = 1; rows <= n; rows++) {

            for (int cols = 6; cols >= rows; cols--) {

                System.out.print(c + " ");

            }
            c = c + 1;
            System.out.println();
        }
    }

    static void pattern27(int n) {
        /*
        1 2 3 4  17 18 19 20
          5 6 7  14 15 16
            8 9  12 13
              10 11
            */

        int c = 1;
        int k = 17;
        int rows;
        for (rows = 1; rows <= n; rows++) {
            for (int spaces = 0; spaces <= rows - 1; spaces++) {
                System.out.print(" ");
            }
            for (int cols = n; cols >= rows; cols--) {

                System.out.print(c);
                c = c + 1;
            }
            for (int spaces = 1; spaces <= 1; spaces++) {
                System.out.print(" ");
            }
//            for (rows = 1; rows <= n; rows++) {
//                for (int cols = n; cols >= rows; cols--) {
//                    System.out.print(k + " ");
//                    k = k+ 1;
//                }
                System.out.println();
//            }
        }
    }
}



