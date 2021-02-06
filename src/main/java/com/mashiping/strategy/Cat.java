package com.mashiping.strategy;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Cat implements MyComparable {
    private int weight;
    private int height;

    @Override
    public int compareTo(Object o) { // 需要强转
        Cat other = (Cat) o;
        if (this.weight > other.weight) return 1;
        else if (this.weight < other.weight) return -1;
        else return 0;
    }
}
