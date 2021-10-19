package com.souvik.Day36;

//https://leetcode.com/problems/reverse-prefix-of-word/

public class LC_2000_ReversePrefix {


    public static void main(String[] args) {


        String word= "abczbn";
        char ch= 'z';
        System.out.println(reversePrefix(word,ch));

    }
    public static String reversePrefix(String word, char ch) {

        /*Runtime: 3 ms, faster than 18.16% of Java online submissions for Reverse Prefix of Word.
        Memory Usage: 38.7 MB, less than 59.06% of Java online submissions for Reverse Prefix of Word.*/

        int i;
        String s= "";

        if(checkifpresent(word,ch) == -1)
        {
            return word;
        }
        if(checkifpresent(word,ch)!= -1)
        {
            s=s+reverseString(word.substring(0,checkifpresent(word,ch)+1));
        }
        s=s+word.substring(checkifpresent(word,ch)+1,word.length());
        return s;

    }

    public static int checkifpresent(String word, char ch)
    {
        int i;
        for (  i = 0; i < word.length() ; i ++)
        {
            if(word.charAt(i) == ch)
            {
                return i;

            }
        }
        return -1;
    }

    public static String reverseString(String word)
    {
        int length = word.length();
        StringBuilder reversed= new StringBuilder();

        while(length > 0)
        {
            reversed.append(word.charAt(length - 1));
            length --;
        }
        return reversed.toString();
    }

}
