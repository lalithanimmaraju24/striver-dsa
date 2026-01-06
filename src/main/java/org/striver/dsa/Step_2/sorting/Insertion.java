package org.striver.dsa.Step_2.sorting;

public class Insertion {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    public static void InsertionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j= i;
            while(j> 0 && arr[j-1]>arr[j]){
                swap(arr, j, j-1);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,6,6,7,1,2};
        InsertionSort(arr);
        for(int i: arr){
            System.out.println(i);
        }
    }
}
