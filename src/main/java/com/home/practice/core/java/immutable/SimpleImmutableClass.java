package com.home.practice.core.java.immutable;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
public final class SimpleImmutableClass {

    int id;
    String name;

}
