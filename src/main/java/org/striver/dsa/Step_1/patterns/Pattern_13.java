package org.striver.dsa.Step_1.patterns;


import java.util.Scanner;

/**
 *  Print the below pattern  for N=5
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
 *
 **/

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NumberOfLines = s.nextInt();
        int number=1;
        for(int row=1;row<=NumberOfLines;row++){
            for(int col=1;col<=row;col++){
                System.out.print(number++);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}