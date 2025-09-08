package org.striver.dsa.Step_1.patterns;


import java.util.Scanner;

/**
 *  Print the below pattern  for N=6
         1
         01
         101
         0101
         10101
         010101
 *
 **/

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NumberOfLines = s.nextInt();
        int start;
        for(int row=0;row<NumberOfLines;row++){
            if(row%2==0) {
                start =1;
            }
            else{
                start=0;
            }
            for(int col=0;col<=row;col++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
}