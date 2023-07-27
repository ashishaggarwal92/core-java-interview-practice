package com.home.practice.core.java.sorting;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@Builder
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person {

    int id;
    String name;
    int salary;
    String department;
}
