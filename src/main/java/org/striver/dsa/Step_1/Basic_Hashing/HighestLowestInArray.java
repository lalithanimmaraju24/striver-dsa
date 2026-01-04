package org.striver.dsa.Step_1.Basic_Hashing;

import java.util.HashMap;

public class HighestLowestInArray {
    public static int[] findFrequency(int[] arr,int[] res){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int min_frequency = Integer.MAX_VALUE;
        int max_frequency = Integer.MIN_VALUE;
        for(int i:arr){
            int currFrequency = map.get(i);
            if(max_frequency < currFrequency) {
                res[0]= i; max_frequency = currFrequency;
            }
            if(min_frequency> currFrequency) {
                res[1] = i; min_frequency = currFrequency;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1,2,2,2,2,3,3,4,4,4,6};
        int[] res = new int[2];
        res = findFrequency(arr,res);
        System.out.print("Maximum element "+ res[0] + " "+ "Minimum element "+ res[1]);
    }
}
