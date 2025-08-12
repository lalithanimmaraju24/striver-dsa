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
        for(int i=NumberOfLines;i>0;i--){
            for(int j=0;j<NumberOfLines-i;j++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}