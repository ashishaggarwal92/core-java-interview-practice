package com.home.practice.core.java.functional.interfac;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        Supplier<Integer> returnRandomNInteger = () -> new Random().nextInt();
        System.out.println(returnRandomNInteger.get());
        System.out.println(returnRandomNInteger.get());



    }
}
