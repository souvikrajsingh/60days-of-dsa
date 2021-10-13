package com.souvik.Day32;

public class Pattern20 {
    public static void main(String[] args) {

        pattern20(5);
    }
    static void pattern20( int n )
    {
        for (int rows = 0; rows < n; rows++) {

            for (int cols = 0; cols <5 ; cols++) {

                if(rows == 0 || rows == (n- 1)) {
                    System.out.print("*");
                }
                else if(cols == 0 || cols == (n- 1))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
