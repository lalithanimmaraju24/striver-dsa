package org.striver.dsa.Step_1.Basic_Math;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean checkPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        System.out.println(checkPalindrome(input));
    }
}
