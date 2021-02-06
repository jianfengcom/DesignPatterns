package com.mashiping.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(9),
                new Dog(5),
                new Dog(2),
                new Dog(7)};

        Sorter<Dog> sorter = new Sorter();
        sorter.sort(dogs, (o1, o2) -> {
            if (o1.getHeight() > o2.getHeight()) return 1;
            else if (o1.getHeight() < o2.getHeight()) return -1;
            return 0;
        });
        System.out.println(Arrays.toString(dogs));

        /*Cat[] arr = {new Cat(9, 9),
                new Cat(5, 5),
                new Cat(2, 2),
                new Cat(7, 7), };
        Sorter sorter = new Sorter();
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));*/
    }
}
