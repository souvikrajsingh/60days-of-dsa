package com.souvik.Day17;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        /*pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
        pattern12(n);
        pattern13(n);
        pattern28(n);*/
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern5(int n) {
        for (int row = 0; row < (2 * n); row++) {

            int totalColsInRow = row > n ? (2 * n) - row : row;

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
    }

    static void pattern6(int n)
    {
        for (int i = 0; i < n; i++) {

            int cols=(i+1);
            int noOfspaces= n-cols;

            for (int spaces = 0; spaces < noOfspaces; spaces++) {
                System.out.print(" ");
            }

            for (int j = 0; j < cols; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern7(int n)
    {
        for (int i = 0; i < n; i++) {

            int cols=n;
            int totalspaces=i;

            for (int spaces = 0; spaces < totalspaces ; spaces++) {
                System.out.print(" ");
            }

            for (int j = i; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern8(int n)
    {
        for (int i = 0; i <=n; i++)
        {
            int totalspace=(n-i);
            int cols=(2*i)-1;

            for (int spaces = 0; spaces < totalspace; spaces++)
            {
                 System.out.print(" ");
            }
            for (int j = 0; j < cols; j++)
            {
               System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();
    }

        static void pattern9(int n)
        {
            for (int i = 5; i >=0 ; i--)
            {
                int cols=(2*i)+1;
                int totalspace=n-i;

                for (int spaces = 0; spaces < totalspace; spaces++)
                {
                    System.out.print(" ");
                }
                for (int j = 0; j < cols; j++)
                {
                    System.out.print("*");
                }

                System.out.println();
            }
            System.out.println();
        }

        static void pattern10(int n)
        {
            for (int i = 0; i < n; i++) {

                int totalspace=(n-i)-1;

                for (int space = 0; space < totalspace; space++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <=i; j++) {
                    System.out.print("* ");

                }
                System.out.println();
            }
            System.out.println();
        }
        static void pattern11(int n)
        {
            for (int i = 0; i < n; i++) {
                int totalspace =i;

                for (int space = 0; space < totalspace; space++) {
                    System.out.print(" ");
                }
                for (int j = i; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
        }

        static void pattern12(int n)
        {
            for (int i = 0; i < n; i++) {
                int totalspace =i;

                for (int space = 0; space < totalspace; space++) {
                    System.out.print(" ");
                }
                for (int j = i; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 0; i < n; i++) {

                int totalspace=(n-i)-1;

                for (int space = 0; space < totalspace; space++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <=i; j++) {
                    System.out.print("* ");

                }
                System.out.println();
            }
        }

        static void pattern13(int n)
        {
            for (int i = 0; i <=n; i++)
            {
                int totalspace=(n-i);
                int cols=(2*i)-1;

                for (int spaces = 0; spaces < totalspace; spaces++)
                {
                    System.out.print(" ");
                }
                for (int j = 0; j <cols; j++)
                {
                        System.out.print("*");


                }

                System.out.println();
            }
        }
    }
