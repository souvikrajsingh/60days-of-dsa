package com.souvik.Day4;

import java.util.Scanner;

public class Right_Pascal_Triangle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=0;i<5;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=0;i<4;i++)
        {
            for(j=i;j<4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
