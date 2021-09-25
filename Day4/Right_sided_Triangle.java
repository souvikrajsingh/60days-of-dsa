package com.souvik.Day4;

import java.util.Scanner;

public class Right_sided_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter the number of rows: ");
        int r= sc.nextInt();*/
        System.out.println("Right Sided Increasing pattern : ");
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Left sided Increasing Pattern: ");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

