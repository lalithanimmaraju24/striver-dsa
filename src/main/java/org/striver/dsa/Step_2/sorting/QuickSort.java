package org.striver.dsa.Step_2.sorting;

public class QuickSort {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    public static int findPartitionIndex(int[] arr, int low, int high){
        int pivot = arr[low], i= low+1, j= high;
        while(i<=j){
            while(i<=high && arr[i]<=pivot){
                i++;
            }
            while(j>=low && arr[j]>pivot){
                j--;
            }
            if(i<j) {
                swap(arr,i,j);
                i++;j--;
            }
        }
        swap(arr,low,j);
        return j;
    }
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int partitionIndex = findPartitionIndex(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,8,0,4,5,6,6,7,1,2};
        quickSort(arr,0,arr.length-1);
        for(int i: arr){
            System.out.println(i);
        }
    }
}
