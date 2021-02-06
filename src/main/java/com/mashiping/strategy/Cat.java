package com.mashiping.strategy;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Cat {
    private int weight;
    private int height;

    public int compare(Cat other) {
        return this.weight < other.weight ? -1 : this.weight == other.weight ? 0 : 1 ;
    }
}
