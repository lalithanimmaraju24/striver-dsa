package org.striver.dsa.Step_1.patterns;


import java.util.Scanner;

/**
 *  Print the below pattern  for N=5
        E
        E D
        E D C
        E D C B
        E D C B A
 *
 **/

public class Pattern_18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NumberOfLines = s.nextInt();
        for(int row=1;row<=NumberOfLines;row++){
            for(int col=1;col<=row;col++){
                System.out.print((char)('E'- col+1));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}