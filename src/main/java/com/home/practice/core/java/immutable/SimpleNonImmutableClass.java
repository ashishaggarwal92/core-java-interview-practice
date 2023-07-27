package com.home.practice.core.java.immutable;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@AllArgsConstructor
public final class SimpleNonImmutableClass {

    int id;
    String name;

}
