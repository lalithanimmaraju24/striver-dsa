package org.striver.dsa.Step_1.Basic_Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void fibonacci(int n,int i, int j){
        if(n<0)return;
        System.out.print(i);
        fibonacci(n-1,i+j,i);
    }
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       fibonacci(n,0,1);
    }
}
