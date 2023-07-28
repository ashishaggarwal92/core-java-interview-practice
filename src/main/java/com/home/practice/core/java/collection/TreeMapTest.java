package com.home.practice.core.java.collection;

import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<Integer, String> maps = new TreeMap<>();

        // Null not allowed in TreeMap
        //maps.put(null, null);
        maps.put(1, "A");

        System.out.println(maps);
    }
}
