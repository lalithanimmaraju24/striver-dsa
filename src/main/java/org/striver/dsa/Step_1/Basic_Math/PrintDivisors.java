package org.striver.dsa.Step_1.Basic_Math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintDivisors {
    public static List<Integer> allDivisors(int n){
        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0) result.add(i);
            if(i!= n/i) result.add(n/i);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        List<Integer> allDivisors = allDivisors(n);
        allDivisors.forEach(i-> System.out.println(i));
    }
}
