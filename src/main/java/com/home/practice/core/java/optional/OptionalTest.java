package com.home.practice.core.java.optional;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        System.out.println("****** TEST 1 *****");
        OptionalTest.test1();

        System.out.println("****** TEST 2 *****");
        OptionalTest.test2();
    }

    private static void test1() {
        String name = "Ashish";
        String nameNull = null;

        Optional<String> optionalName = Optional.of(name);
        // Below will give exception at run time. In case of possible null values we need to use ofNullable
        // Optional<String> optionalNullName = Optional.of(nameNull);
        Optional<String> optionalNullName = Optional.ofNullable(nameNull);

        // If a value is present, returns the value, otherwise throws NoSuchElementException.
        System.out.println(optionalName.get());
        System.out.println(optionalNullName.isPresent());

    }

    private static void test2() {
        String[] words = new String[10];
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        } else
            System.out.println("word is null");
    }


}
