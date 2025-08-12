package org.striver.dsa.Step_1.patterns;


import java.util.Scanner;

/**
 *  Print the below pattern  for N=6
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
 *
 **/
public class Pattern_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NumberOfLines = s.nextInt();
        for(int i=0;i<NumberOfLines;i++){
            for(int j=0;j<NumberOfLines;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
