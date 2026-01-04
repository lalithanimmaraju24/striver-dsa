package org.striver.dsa.Step_1.Basic_Recursion;

import java.util.Scanner;

public class print1toN {
    public static void printRecursion(int i,int n){
        if(n==0) return;
        System.out.println(i);
        printRecursion(i+1,n-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printRecursion(1,n);
    }
}
