package com.souvik.Day21;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class PangramSentence {

    public static void main(String[] args) {

        String sentence="abcdefijklmnopqrstuvwxyz";
        boolean pangram=checkIfPangram(sentence);
        System.out.println("Sentence Length : " + sentence.length());

        int ch=97;
        System.out.println((char)ch);
        System.out.println(pangram);

    }
    public static boolean checkIfPangram(String sentence) {
        if(sentence.length() >= 26) {
            for (int i = 0; i < sentence.length(); i++) {
                int ch = 96;
                ch = ch + 1;
                if ((char) ch == sentence.charAt(i)) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }
}
