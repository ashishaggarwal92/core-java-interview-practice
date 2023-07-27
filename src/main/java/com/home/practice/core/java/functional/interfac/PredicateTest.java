package com.home.practice.core.java.functional.interfac;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateTest {

    public static void main(String[] args) {
        Person p1 = createPerson(1, "Ashish", 2000, "IT");
        Person p2 = createPerson(2, "Manish", 7000, "FINANCE");
        Person p3 = createPerson(6, "Harshit", 5000, "FINANCE");
        Person p4 = createPerson(9, "Mayank", 8000, "IT");
        Person p5 = createPerson(9, "Ashish", 6000, "ADMIN");

        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5);
         // Get person where salary > 5000
        Predicate<Person> salaryPredicate = p -> p.getSalary() > 5000;
        List<Person> salaryGreater5000 = personList.stream().filter(salaryPredicate).collect(Collectors.toList());
        System.out.println("Person with salary > 5000");
        System.out.println(salaryGreater5000);

        long total = personList.stream().filter(salaryPredicate).count();
        System.out.println("Count of person > 5000 : " + total);


        // AllMatch will return false is all are not matching
        boolean allMatch = personList.stream().allMatch(salaryPredicate);
        System.out.println(allMatch);

        // AnyMatch will return true if atleast one is matching
        boolean anyMatch = personList.stream().anyMatch(salaryPredicate);
        System.out.println(anyMatch);


        // Int predicate
        IntPredicate intPredicateGreaterThan0 = x -> x > 0;
        IntPredicate intPredicateGreaterThan10 = x -> x > 10;
        Stream.iterate(-5, x -> x+1).limit(10).filter(x -> intPredicateGreaterThan0.test(x)).forEach(System.out::println);

        System.out.println(intPredicateGreaterThan0.test(3)); // true

        System.out.println(intPredicateGreaterThan0.and(intPredicateGreaterThan10).test(3)); // false

        // BiPredicate Test
        BiPredicate<Integer, Integer> biPredicateTest = (x, y) -> x>y;


    }





    private static Person createPerson(int id, String name, int salary, String depat) {

        return Person.builder()
                .id(id)
                .name(name)
                .salary(salary)
                .department(depat)
                .build();



    }


}
