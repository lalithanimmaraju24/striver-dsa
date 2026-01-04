package org.striver.dsa.Step_1.Basic_Recursion;

import java.util.Scanner;

public class printNtimes {
    public static void printRecursion(int i,int n){
        if(i==n) return;
        System.out.println(n);
        printRecursion(i+1, n);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printRecursion(0,n);
    }
}
