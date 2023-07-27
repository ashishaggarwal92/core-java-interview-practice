package com.home.practice.core.java.stream;

import com.home.practice.core.java.functional.interfac.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxMinTest {

    public static void main(String[] args) {

        // Max
        Integer max = Stream.iterate(1, x -> x+1).limit(10).max(Comparator.naturalOrder()).get();
        System.out.println(max);

        // Min
        Integer min = Stream.iterate(1, x -> x+1).limit(10).min(Comparator.naturalOrder()).get();
        System.out.println(min);
        
        // Total Salary per department
        List<Person> personList = getPersonList();
        Map<String, Long> groupByDept = personList.stream().collect(Collectors.groupingBy(Person::getDepartment, Collectors.summingLong(Person::getSalary)));
        System.out.println(groupByDept);
    }

    private static List<Person> getPersonList() {
        Person p1 = createPerson(1, "Ashish", 2000, "IT");
        Person p2 = createPerson(2, "Manish", 7000, "FINANCE");
        Person p3 = createPerson(6, "Harshit", 5000, "FINANCE");
        Person p4 = createPerson(9, "Mayank", 8000, "IT");
        Person p5 = createPerson(9, "Ashish", 6000, "ADMIN");
        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5);
        return personList;
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
