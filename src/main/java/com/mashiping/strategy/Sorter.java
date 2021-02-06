package com.mashiping.strategy;

public class Sorter {
    public void sort(Cat[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minParam = i;
            for (int j = i + 1; j < arr.length; j++) {
//                minParam = arr[minParam].compare(arr[j]) == 1 ? j : minParam;
                if (arr[minParam].compare(arr[j]) == 1) minParam = j;
            }
            swap(arr, i, minParam);
        }
    }

    private void swap(Cat[] arr, int a, int b) {
        Cat temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}