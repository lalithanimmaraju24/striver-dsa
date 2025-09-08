package org.striver.dsa.Step_1.patterns;


import java.util.Scanner;

/**
 *  Print the below pattern  for N=6
         ******
         *    *
         *    *
         *    *
         *    *
         ******
 *
 **/

public class Pattern_21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NumberOfLines = s.nextInt();
        for(int row=1;row<=NumberOfLines; row++){
            for(int col=1;col<=NumberOfLines; col++){
                if(row==1 ||col==1 || row==NumberOfLines ||col==NumberOfLines){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}