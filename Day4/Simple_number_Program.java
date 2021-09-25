package com.souvik.Day4;

public class Simple_number_Program {
    public static void main(String[] args) {
        System.out.println("Pattern 1: ");
        int i,j;
        int p;
        int c=1;
        for(i=1;i<=5;i++)
        {
            for(j=1,p=1;j<=i;j++,p++)
            {
                System.out.print(p+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Floyd's Triangle: ");
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println(" ");
        }
    }
}
