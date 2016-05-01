package com.anurag.string;
public class PoolTest {

    public static void main(String... args) {

        // Pooling of Integer [-127, 127]
        Integer x = 127, y = 127;
        System.out.println("Integer:" + (x == y)); // prints true
        x = 129;
        y = 129;
        System.out.println("Integer:" + (x == y)); // prints false

        // Apparent pooling of short [-127, 127]
        Short i = 127, j = 127;
        System.out.println("Short: " + (i == j)); // prints true
        i = 128;
        j = 128;
        System.out.println("Short: " + (i == j)); // prints false

        // No pooling of long values
        Long k = 10L, l = 10L;
        System.out.println("Long: " + (i == j)); // prints false
        k = 128L;
        l = 128L;
        System.out.println("Long: " + (i == j)); // prints false

    }
}