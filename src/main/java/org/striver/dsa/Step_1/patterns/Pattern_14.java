package org.striver.dsa.Step_1.patterns;


import java.util.Scanner;

/**
 *  Print the below pattern  for N=6
     A
     AB
     ABC
     ABCD
     ABCDE
     ABCDEF
 *
 **/

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NumberOfLines = s.nextInt();
        for(int row=1;row<=NumberOfLines;row++){
            for(char col='A';col<='A'+row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}