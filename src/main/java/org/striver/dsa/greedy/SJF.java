package org.striver.dsa.greedy;

public class SJF {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,7};
        int n = arr.length;
        int wt=0,t=0;
        for(int i:arr){
            wt+=t;
            t+=i;
        }
        System.out.println(wt/n);
    }
}
