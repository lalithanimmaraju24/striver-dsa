package org.striver.dsa.Step_1.Basic_Recursion;

public class Palindrome {
    public static boolean checkPalindrome(String s, int i, int j){
        if(i>=j) return true;
        return s.charAt(i)==s.charAt(j) && checkPalindrome(s,i+1,j-1);
    }
    public static void main(String[] args) {
        String s ="ebabe";
        System.out.println(checkPalindrome(s,0,s.length()-1));
    }
}
