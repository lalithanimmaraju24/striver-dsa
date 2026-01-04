package org.striver.dsa.Step_1.Basic_Math;

import java.util.Scanner;

public class CheckForPrime {
    public static boolean primeCheck(int n){
        if(n<=1) return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3 ==0 ) return false;
        for(int i=5; i*i<=n;i+=6){
            if(n%i==0 || n%(i+2) ==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(primeCheck(n));
    }
}
