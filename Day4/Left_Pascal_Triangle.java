package com.souvik.Day4;

import java.util.Scanner;

public class Left_Pascal_Triangle {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<5;i++)
        {
            for(j=i;j<5;j++)
            {
                System.out.print(" ");
            }
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for (j=i;j<4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
