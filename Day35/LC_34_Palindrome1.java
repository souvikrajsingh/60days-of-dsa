package com.souvik.Day35;

//https://leetcode.com/problems/valid-palindrome/

import java.util.Locale;

public class LC_34_Palindrome1 {

    public static void main(String[] args) {

        String s = "0P";
        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s) {


        /*Runtime: 2102 ms, faster than 5.00% of Java online submissions for Valid Palindrome.
        Memory Usage: 544.4 MB, less than 5.00% of Java online submissions for Valid Palindrome.*/

        s=s.toLowerCase();
        System.out.println(s);

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
                newString.append(s.charAt(i));
            }
            if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
                newString.append(s.charAt(i));
            }
        }
        System.out.println(newString.toString());


        for (int i = 0; i < newString.toString().length()/2; i++) {

            char start = newString.toString().charAt(i);
            char end = newString.toString().charAt(newString.toString().length() - 1 - i);


            if(start!= end)
            {
                return false;
            }

        }

        return true;
    }
}
