package com.home.practice.core.java.stream;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SkipLimitTest {

    public static void main(String[] args) {
        List<Person> personList = getPersonList();

        // Get second highest salary
        personList.stream().map(x -> x.getSalary()).sorted().limit(2).skip(1).forEach(System.out::println);

        // Sum of salary per deparment
        Map<String, Long> salaryPerDept = personList.stream().collect(Collectors.groupingBy(Person::getDepartment, Collectors.summingLong(Person::getSalary)));
        System.out.println(salaryPerDept);



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
