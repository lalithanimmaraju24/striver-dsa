package org.striver.dsa.sorting;

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
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
