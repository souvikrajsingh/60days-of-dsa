package com.souvik.Day11;


 /*

 https://leetcode.com/problems/valid-perfect-square/

  */
public class LC_367 {
  public static void main(String[] args) {
  int num=12;
   System.out.println(isPerfectSquare(num));
  }

  public static boolean isPerfectSquare(int num) {

   if (num < 2) {
    return true;
   }
   long start = 2;
   long end = num;
   while (start <= end) {
    long mid = start + (end - start) / 2;
    if (mid * mid == num) {
     return true;
    }
    if (mid * mid > num) {
     end = mid - 1;
    } else {
     start = mid + 1;
    }
   }
   return false;

  }
 }