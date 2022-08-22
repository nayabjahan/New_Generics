package com.blz.generic;

import static com.blz.generic.IntMax.maximum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Generics example");
        System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6,
                8.8, 7.7));
        System.out.printf("Maximum of %s, %s and %s is %s\n", "apple", "peach", "banana", maximum(
                "apple", "peach", "banana"));
    }

}

