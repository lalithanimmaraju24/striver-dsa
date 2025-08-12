package org.striver.dsa.Step_1.patterns;


import java.util.Scanner;

/**
 *  Print the below pattern  for N=6
     1
     2 2
     3 3 3
     4 4 4 4
     5 5 5 5 5
     6 6 6 6 6 6
 *
 **/

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int NumberOfLines = s.nextInt();
        for(int i=0;i<NumberOfLines;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}