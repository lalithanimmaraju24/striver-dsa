package org.striver.dsa.Step_1.Basic_Math;
import java.util.Scanner;

public class CountDigits {
    public static int countDigits(int number){
        if(number==0) return 1;
        if(number<0) number *= -1;
        int digits=0;
        while(number>0){
            digits++;
            number/=10;
        }
        return digits;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Integer number = s.nextInt();
        System.out.println(countDigits(number));
    }
}
