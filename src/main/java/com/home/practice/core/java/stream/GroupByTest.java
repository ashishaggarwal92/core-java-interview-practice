package com.home.practice.core.java.stream;

import com.home.practice.core.java.functional.interfac.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByTest {

    public static void main(String[] args) {

        // Total Salary per department
        List<Person> personList = getPersonList();
        Map<String, Long> groupByDept = personList.stream().collect(Collectors.groupingBy(Person::getDepartment, Collectors.summingLong(Person::getSalary)));
        System.out.println(groupByDept);


        // Collect All person per ID
        Map<Integer, List<Person>> personById = personList.stream().collect(Collectors.groupingBy(Person::getId, Collectors.toList()));
        System.out.println(personById);

    }

    private static List<Person> getPersonList() {
        Person p1 = createPerson(1, "Ashish", 2000, "IT");
        Person p2 = createPerson(2, "Manish", 7000, "FINANCE");
        Person p3 = createPerson(6, "Harshit", 5000, "FINANCE");
        Person p4 = createPerson(9, "Mayank", 8000, "IT");
        Person p5 = createPerson(9, "Ashish", 6000, "ADMIN");
        Person p6 = createPerson(1, "Ashish", 2000, "ADMIN");
        List<Person> personList = Arrays.asList(p1,p2,p3,p4,p5, p6);
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
