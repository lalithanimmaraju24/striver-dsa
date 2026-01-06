package org.striver.dsa.Step_2.sorting;

public class Bubble {
    public static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort(int[] arr,int n){
        for(int i=0;i<n;i++){
            boolean didSwap = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    didSwap = true;
                }
            }
            if(!didSwap) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,6,7};
        bubbleSort(arr, arr.length);
        for(int i: arr){
            System.out.println(i);
        }

    }
}
