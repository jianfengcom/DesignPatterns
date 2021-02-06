package com.mashiping.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] arr = {new Cat(9, 9),
                new Cat(2, 2),
                new Cat(7, 7), };
        Sorter sorter = new Sorter();
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
