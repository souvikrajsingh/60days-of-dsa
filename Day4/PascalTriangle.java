package com.souvik.Day4;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        int no= sc.nextInt();
        int spaces=no;
        int number=1;
        for(int i=0;i<no;i++)
        {
            for(int s=1;s<=spaces;s++)
            {
                System.out.print(" ");
            }
            number=1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(number + " ");
                number=number * (i-j)/(j+1);
            }
            spaces--;
            System.out.println();
        }
        /*int n=sc.nextInt();
        int spaces=n;
        int i,j;
        for(i=0;i<n;i++)
        {  //nested loop for the spaces
            for(j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            n=1;
            for(j=0;j<=i;j++)
            {
                System.out.print(n+ " ");
                n=n*(i-j)/(j+1);

            }
            spaces--;
            System.out.println();
        }*/
    }
}
