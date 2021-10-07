package com.souvik.Day28;

//https://leetcode.com/problems/guess-number-higher-or-lower/

//Not Working

public class LC_374_GuessGame {

    static int[ ] guess = { 1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {

        int pickedNumber = guessNumber(5);
        System.out.println(pickedNumber);

    }
    public static int guessNumber(int n) {

        int s = 0 ;
        int e = n ;

        while(s <= e )
        {
            int mid = (s + (e-s) / 2 );

            if(guess[mid] == 0)
            {
                return mid;
            }
            else if ( guess [mid] == -1)
            {
                e = mid -1;
            }
            else
            {
                s = mid +1 ;
            }
        }
        return  -1;
    }
}
