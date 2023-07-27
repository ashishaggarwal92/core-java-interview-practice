package com.home.practice.core.java.functional.interfac;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;


// Function wil have one input parameter and one output parameter
public class FunctionTest {

    public static void main(String[] args) {
        // here first parameter in declaration is input and second one is output
        Function<Integer, Long> squareFunction = (a) -> (long) (a * a);

        List<Integer> list = Arrays.asList(1,2,3,4);
        list.forEach(x ->  {
            long square = squareFunction.apply(x);
            System.out.println(x + " square is :" + square);
        });

        list.stream().map(squareFunction).forEach(System.out::println);


        // Bi Function:
        System.out.println("BiFunction");
        BiFunction<Integer, Integer, Long> computeSalary = (monthlySalary , months) -> (long) monthlySalary * months;
        list.stream().map(salary -> computeSalary.apply(salary, 12)).forEach(System.out::println);

    }
}
