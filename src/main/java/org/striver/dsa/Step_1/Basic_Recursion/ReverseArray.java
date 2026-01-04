package org.striver.dsa.Step_1.Basic_Recursion;

import java.util.List;
import java.util.Scanner;

public class ReverseArray {
    public static void swap(int[] arr, int i, int j){
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }
    public static void reverseArray(int[] array, int i, int j){
        if(i>=j) return;
        swap(array,i,j);
        reverseArray(array,i+1,j-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[]{1,2};
        reverseArray(array,0,array.length-1);
        for(int i: array){
            System.out.print(i+" ");
        }
    }
}
