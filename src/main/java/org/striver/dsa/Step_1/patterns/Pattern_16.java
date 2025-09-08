package org.striver.dsa.Step_1.patterns;


import java.util.Scanner;

/**
 *  Print the below pattern  for N=6
     A
     BB
     CCC
     DDDD
     EEEEE
     FFFFFF
 *
 **/

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NumberOfLines = s.nextInt();
        for(int row=1;row<=NumberOfLines;row++){
            for(int col = 1; col<= row;col++){
                System.out.print((char)('A'+ row-1));
            }
            System.out.println();
        }
    }
}