package org.striver.dsa.Step_1.Basic_Math;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int number){
        boolean isNegative = false;
        if(number<0){
            isNegative = true;
            number *=-1;
        }
        int result =0;
        while(number>0){
            int temp = number%10;
            result = (result*10) +temp;
            number /=10;
        }
        return isNegative ? -1 * result : result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer number = s.nextInt();
        System.out.println(reverseNumber(number));
    }
}
