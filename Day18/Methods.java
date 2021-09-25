package com.souvik.Day18;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name= "Souvik Raj Singh";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('v'));
        System.out.println("               Souvik.   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
