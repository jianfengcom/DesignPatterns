package com.mashiping.strategy;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Cat implements MyComparable<Cat> {
    private int weight;
    private int height;

    @Override
    public int compareTo(Cat o) {
        if (this.weight > o.weight) return 1;
        else if (this.weight < o.weight) return -1;
        else return 0;
    }
}
