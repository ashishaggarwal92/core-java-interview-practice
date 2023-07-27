package com.home.practice.core.java.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciTest {
    public static void main(String[] args) {

        Stream
                .iterate(new int[]{0,1}, x -> new int[] {x[1], x[0]+x[1]})
                .limit(8).map(x -> x[0])
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
