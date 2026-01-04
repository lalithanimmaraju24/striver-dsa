package org.striver.dsa.Step_1.Basic_Math;

import java.util.Scanner;

public class GCD {
    static int gcd(int a,int b) {
        while (a > 0 && b > 0) {
            int c = Math.max(a, b);
            int d = Math.min(a, b);
            return gcd(c % d, d);
        }
        return a==0? b : a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        System.out.println(gcd(a,b));
    }
}
