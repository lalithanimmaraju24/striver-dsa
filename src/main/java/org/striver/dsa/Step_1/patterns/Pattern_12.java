package org.striver.dsa.Step_1.patterns;


import java.util.Scanner;

/**
 *  Print the below pattern  for N=4
     1      1
     12    21
     123  321
     12344321
 *
 **/

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NumberOfLines = s.nextInt();
        for(int row=1;row<=NumberOfLines;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            for(int k=1;k<=2*(NumberOfLines-row);k++){
                System.out.print(" ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}