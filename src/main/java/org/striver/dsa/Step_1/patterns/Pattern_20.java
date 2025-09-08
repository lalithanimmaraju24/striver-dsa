package org.striver.dsa.Step_1.patterns;


import java.util.Scanner;

/**
 *  Print the below pattern  for N=6
         *          *
         **        **
         ***      ***
         ****    ****
         *****  *****
         ************
         *****  *****
         ****    ****
         ***      ***
         **        **
         *          *
 *
 **/

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NumberOfLines = s.nextInt();
        for(int row=1;row<=NumberOfLines;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            for(int space=1;space<NumberOfLines-row+1;space++){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=NumberOfLines-1;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            for(int space=1;space<NumberOfLines-row+1;space++){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}