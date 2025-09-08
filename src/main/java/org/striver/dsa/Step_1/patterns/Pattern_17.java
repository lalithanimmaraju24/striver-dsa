package org.striver.dsa.Step_1.patterns;


import java.util.Scanner;

/**
 *  Print the below pattern  for N=6
          A
         ABA
        ABCBA
       ABCDCBA
 *
 **/

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NumberOfLines = s.nextInt();
        for(int row=1;row<=NumberOfLines;row++){
            for(int space = 1; space<=NumberOfLines-row;space++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print((char)(col+'A'-1));
            }
            for(int col=row-1;col>=1; col--){
                System.out.print((char)(col+'A'-1));
            }
            System.out.println();
        }
    }
}