package com.home.practice.core.java.immutable;

import java.util.ArrayList;
import java.util.List;

public class TestImmutable {

    public static void main(String[] args) {
        immutableTest();
        nonImmutableTest();


    }

    private static void immutableTest() {
        List<Integer> scores = new ArrayList<>();
        scores.add(1);
        scores.add(2);
        scores.add(3);
        PersonImmutable p1 = new PersonImmutable(1,"A", scores);

        System.out.println(p1);

        // Add new score in list
        scores.add(4);
        // Even after adding 4, sores with have only existing elements
        System.out.println(p1);
    }


    private static void nonImmutableTest() {
        List<Integer> scores = new ArrayList<>();
        scores.add(1);
        scores.add(2);
        scores.add(3);
        PersonNonImmutable p1 = new PersonNonImmutable(1,"A", scores);

        System.out.println(p1);

        // Add new score in list
        scores.add(4);
        // it will add 4
        System.out.println(p1);
    }


}
