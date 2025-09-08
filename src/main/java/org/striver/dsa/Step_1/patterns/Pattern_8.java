package org.striver.dsa.Step_1.patterns;


import java.util.Scanner;

/**
 *  Print the below pattern  for N=6
     ***********
      *********
       *******
        *****
         ***
          *
 *
 **/

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NumberOfLines = s.nextInt();
        for(int row=NumberOfLines;row>0;row--){
            for(int col=0;col<NumberOfLines-row;col++){
                System.out.print(" ");
            }
            for(int col=0; col<(2*row)-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}