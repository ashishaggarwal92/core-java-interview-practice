package com.home.practice.core.java.immutable;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
// Rule 1 : Final class
public final class PersonImmutable {

    // Rule 2: private and final data member
    private final int id;
    private final String name;
    private final List<Integer> scores;

    // Rule 3 : Public constructor performing deep copy
    public PersonImmutable(int id, String name, List<Integer> scores) {
        this.id = id;
        this.name = name;
        List<Integer> scoresCopy = new ArrayList<>();
        for(Integer score: scores) {
            scoresCopy.add(score);
        }
        this.scores = scoresCopy;
    }

    // Rule 4: no setters

    // Rule 5: only getters


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Return the copy of object rather than actual object
    public List<Integer> getScores() {
        List<Integer> scoresCopy = new ArrayList<>();
        for(Integer score: scores) {
            scoresCopy.add(score);
        }
        return scoresCopy;
    }
}
