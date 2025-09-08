package org.striver.dsa.Step_1.patterns;


import java.util.Scanner;

/**
 *  Print the below pattern  for N=6
     ABCDEF
     ABCDE
     ABCD
     ABC
     AB
     A
 *
 **/

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NumberOfLines = s.nextInt();
        for(int row=1;row<=NumberOfLines;row++){
            for(int col =1; col<=NumberOfLines-row+1;col++){
                System.out.print((char)('A'+ col-1));
            }
            System.out.println();
        }
    }
}