package com.home.practice.core.java.stream.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingTest {

    public static void main(String[] args) {

        List<Person> personList = getPersonList();
        System.out.println("Print Person");
        personList.forEach(System.out::println);

        // Sort Person by name
        System.out.println("Sort By Name");
        Comparator<Person> sortByName = (p1, p2) -> p1.getName().compareTo(p2.getName());
        personList.stream().sorted(sortByName).forEach(System.out::println);

        // Sort Person by name then Department
        System.out.println("Sort By Name and department");
        Comparator<Person> sortByDepartment = (p1, p2) -> p1.getDepartment().compareTo(p2.getDepartment());
        personList.stream().sorted(sortByName.thenComparing(sortByDepartment)).forEach(System.out::println);

        // sort by salary
        System.out.println("Sort By salary");
        personList.stream().sorted(Comparator.comparingInt(Person::getSalary)).collect(Collectors.toList()).forEach(System.out::println);


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
