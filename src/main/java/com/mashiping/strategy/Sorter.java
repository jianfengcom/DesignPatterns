package com.mashiping.strategy;

public class Sorter {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minParam = i;
            for (int j = i + 1; j < arr.length; j++) {
//                minParam = arr[minParam] > arr[j] ? j : minParam;
                if (arr[minParam] > arr[j]) minParam = j;
            }
            swap(arr, i, minParam);
        }
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}