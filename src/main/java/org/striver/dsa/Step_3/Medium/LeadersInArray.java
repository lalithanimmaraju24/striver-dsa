package org.striver.dsa.Step_3.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeadersInArray {
    public static List<Integer> getLeaders(List<Integer> arr){
        List<Integer> result = new ArrayList<>();
        int array_size = arr.size();
        int current_max = arr.get(array_size-1);
        for(int i=array_size-2; i>=0;i--) {
            if (arr.get(i) > current_max) {
                result.add(arr.get(i));
                current_max = arr.get(i);
            }
        }
        return result;
        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> arr = List.of(1, 2, 3, 4, 51, 2, 23, 14, 10, 9);
        List<Integer> leaders_array = getLeaders(arr);
        leaders_array.forEach(System.out::println);
    }
}
