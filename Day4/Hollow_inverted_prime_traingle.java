package com.souvik.Day4;

import java.util.Scanner;

public class Hollow_inverted_prime_traingle {
    public static void main(String[] args) {
        /*
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=1;j++)
            {
                System.out.print(" ");
            }
            for(int k=5;k<=((2*k)-1);k++)
            {
                if(k==1||i==5 || k == (2 * i - 1)))
                {
                    System.out.println("*");
                }
                else
                {
                    System.out.println(" ");
                }
                System.out.println(" ");
            }
        }
    }
}*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");

        int rows = sc.nextInt();
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == rows || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
