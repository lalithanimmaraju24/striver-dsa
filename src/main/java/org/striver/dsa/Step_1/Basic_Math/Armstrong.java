package org.striver.dsa.Step_1.Basic_Math;

import java.util.Scanner;

public class Armstrong {
    public static boolean checkArmstrong(int n){
        int res=0,temp=n;
        while(temp>0){
            int digit = temp%10;
            res+=(digit *digit * digit);
            temp /=10;
        }
        return (res==n);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(checkArmstrong(a));
    }
}
