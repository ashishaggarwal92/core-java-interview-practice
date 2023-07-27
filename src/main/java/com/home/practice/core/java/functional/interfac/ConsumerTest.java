package com.home.practice.core.java.functional.interfac;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest {

    public static void main(String[] args) {

        // Consumer
        System.out.println("Consumer to print square");
        Consumer<Integer> consumerPredicatePrintSquare = x -> System.out.println(x*x);
        Stream.iterate(1, x -> x+1).limit(5).forEach(consumerPredicatePrintSquare);

        // Bi Consumer
        System.out.println("Bi Consumer to print 2 numbers");
        BiConsumer<Integer, Integer> multiply = (x, y) -> System.out.println(x*y);
        Stream.iterate(1, x -> x+1).limit(5).forEach(x -> multiply.accept(x, x+1));


    }
}
