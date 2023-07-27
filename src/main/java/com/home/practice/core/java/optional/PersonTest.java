package com.home.practice.core.java.optional;

import java.util.Optional;

public class PersonTest {

    public static void main(String[] args) {

        Person p = null;

        // Test case 1
        Optional<Person> optionalPerson = Optional.ofNullable(p);
        System.out.println(optionalPerson.isEmpty()); // true
        System.out.println(optionalPerson.isPresent()); // false

        // Test case 2 or else -> default value
        Person person1 = Optional.ofNullable(p).orElse(new Person(1, "A"));
        System.out.println(person1);

        //
        Person person2 = Optional.ofNullable(p).orElseGet(() -> new Person(2, "B"));
        System.out.println(person2);

        Person person3 = null;
        try {
            person3 = Optional.ofNullable(p).orElseThrow(Exception::new);
        } catch (Exception e) {
            System.out.println("Exception");
        }




    }
}
