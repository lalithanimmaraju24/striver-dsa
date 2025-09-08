package org.striver.dsa.Step_1.patterns;


import java.util.Scanner;

/**
 *  Print the below pattern  for N=6
     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
     1 2 3 4 5 6
 *
 **/

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NumberOfLines = s.nextInt();
        for(int row=0;row<NumberOfLines;row++){
            for(int col=0;col<=row;col++){
                System.out.print(col+1);
            }
            System.out.println();
        }
    }
}