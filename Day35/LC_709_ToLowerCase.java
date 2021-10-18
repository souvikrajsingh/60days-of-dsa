package com.souvik.Day35;

public class LC_709_ToLowerCase {

    public static void main(String[] args) {

        String s = "Hello";
        String low = toLowerCase(s);
        System.out.println(low);

    }
        public static String toLowerCase(String s) {

        /* Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
           Memory Usage: 37.2 MB, less than 70.43% of Java online submissions for To Lower Case.*/

            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (isCapitalLetter(chars[i])) {
                    chars[i] = charToLowerCase(chars[i]);
                }
            }
            return String.valueOf(chars);
        }

        private static boolean isCapitalLetter(char ch) {
            return ch >= 'A' && ch <= 'A' + 25;
        }

        private static char charToLowerCase(char ch) {
            return (char) ('a' + (ch - 'A'));
        }

        /* Runtime: 1 ms, faster than 45.61% of Java online submissions for To Lower Case.
        Memory Usage: 38.7 MB, less than 36.18% of Java online submissions for To Lower Case.


            return s.toLowerCase();
*/
    }
