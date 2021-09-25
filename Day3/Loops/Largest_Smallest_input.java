package com.souvik.Day3.Loops;

import java.util.Scanner;

public class Largest_Smallest_input {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);

    int number;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    char choice;

        do
    {
        System.out.print("Enter the number ");
        number = console.nextInt();

        if(number > max)
        {
            max = number;
        }

        if(number < min)
        {
            min = number;
        }

        System.out.print("Do you want to continue y/n? ");
        choice = console.next().charAt(0);

    }while(choice=='y' || choice == 'Y');

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
} }

/*{

        Scanner sc=new Scanner(System.in);
        int n,max=Integer.MAX_VALUE,min=Integer.MIN_VALUE;
        char ch;
        do {
            System.out.println("Enter number: ");
            n=sc.nextInt();
            if(n>max)
            {
                max=n;
            }
            else if(n<min)
            {
                min=n;
            }
            System.out.println("Enter Y to continue entering numbers\nEnter N to terminae the Program");
            ch=sc.next().charAt(0);

        }
        while(ch!='N');
        System.out.println("Max : " + max);
        System.out.println("Min: " + min);
    }*/

