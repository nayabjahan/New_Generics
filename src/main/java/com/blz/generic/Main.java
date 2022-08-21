package com.blz.generic;

import static com.blz.generic.IntMax.maximum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Generics example");
        System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
    }

}

