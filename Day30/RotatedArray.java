package com.souvik.Day30;

import java.util.Arrays;

public class RotatedArray {
    public static void main(String[] args) {

        int[] arr = { 3,4,5,1,2};
        int pos=positionofRotation(arr);
        System.out.println(pos);

        int no_of_elements_in_back = ((arr.length) - (pos + 1 ));

        int no_of_elements_in_front  = (arr.length) - (no_of_elements_in_back);

        System.out.println("no_of_elements_in_back: " + no_of_elements_in_back);

        System.out.println("no_of_elements_in_front: " + no_of_elements_in_front);

        int[] newArray = new int[arr.length];

        for (int i = 0; i < no_of_elements_in_back; i++) {
            newArray[i] = arr [ pos +1];
            pos=pos+1;
        }
        for (int i = no_of_elements_in_back; i < arr.length; i++) {
            newArray[i] = arr [pos ];
            pos=pos+1;
        }

        System.out.println("Sorted Array : " + Arrays.toString(newArray));

    }
    public static int positionofRotation(int [] arr )
    {
        int pos=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1])
            {
                pos=i;
                break;
            }
        }
        return pos;
    }
}
