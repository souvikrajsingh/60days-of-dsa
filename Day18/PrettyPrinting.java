package com.souvik.Day18;

import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        /*float a = 453.1274f;
        System.out.printf("formatted Number is %.2f " , a);


        System.out.println();

        System.out.printf("Pie : %.3f" , Math.PI);*/

        System.out.println('a'  + 'b');

        System.out.println("a"  + 1 );
//        this is same as after few steps "a" + "1"
//        integer is converted to Integer( Wrapper Class)  which will call tostring() function


        System.out.println("Souvik"  + new ArrayList<>());

        System.out.println("Souvik"  + new Integer(56));

        System.out.println(new Integer(56 ) +""+ new ArrayList<>());
//        throws error, works when we add a empty string " ".
    }
}
