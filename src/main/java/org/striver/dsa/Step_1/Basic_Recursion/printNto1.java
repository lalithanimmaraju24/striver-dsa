package org.striver.dsa.Step_1.Basic_Recursion;

import java.util.Scanner;

public class printNto1 {
    public static void printRecursion(int n){
        if(n==0) return ;
        System.out.println(n);
        printRecursion(n-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printRecursion(n);
    }
}
