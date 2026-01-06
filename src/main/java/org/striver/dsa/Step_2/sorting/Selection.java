package org.striver.dsa.Step_2.sorting;

public class Selection {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 6, 7, 8, 9, 10,1,2,3};
        int n = arr.length;
        selectionSort(arr, n);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void selectionSort(int[] arr, int n) {
       for(int i=0;i<n-1;i++){
           int selectedIndex = i;
           int currMin = i;
           for(int j=i+1;j<n;j++){
               if(arr[currMin]>arr[j]){
                   currMin =j;
               }
           }
           int temp = arr[selectedIndex];
           arr[selectedIndex] = arr[currMin];
           arr[currMin] = temp;
       }
    }
}
