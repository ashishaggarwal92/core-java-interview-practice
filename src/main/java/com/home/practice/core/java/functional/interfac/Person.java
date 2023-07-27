package com.home.practice.core.java.functional.interfac;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Person {

    int id;
    String name;
    int salary;
    String department;
}
