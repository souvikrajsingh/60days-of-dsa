package com.souvik.Day32;

public class Pattern32_33_34 {
    public static void main(String[] args) {

        patternnew(5);
    }

    static void patternnew(int n)
    {

        /*
       A
       b C
       d E f
       G h I j
       K l M n O
*/
        int c= 1;
        int capital=65;
        int small=97;
        for (int rows = 1; rows <= 5 ; rows++) {
            for (int cols = 1; cols <=rows; cols++) {
                if((c&1) == 1)
                {
                    System.out.print((char)capital+ " ");
                    capital++;
                    small++;
                    c++;
                }
                else
                {
                    System.out.print((char)small+ " ");
                    small++;
                    capital++;
                    c++;
                }
            }
            System.out.println();
        }
    }
}
