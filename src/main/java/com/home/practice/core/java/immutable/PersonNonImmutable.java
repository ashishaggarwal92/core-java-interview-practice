package com.home.practice.core.java.immutable;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class PersonNonImmutable {

    private int id;
    private String name;
    private List<Integer> scores;

    public PersonNonImmutable(int id, String name, List<Integer> scores) {
        this.id = id;
        this.name = name;
        this.scores = scores;
    }




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getScores() {
        return scores;
    }
}
