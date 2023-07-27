package com.home.practice.core.java.functional.interfac;

public class TestCustomFunctionalInterface {
    public static void main(String[] args) {

        PersonInterface personInterface = (x , y) -> x*y;
        System.out.println(personInterface.computeYearlySalary(1000, 12));



    }
}
