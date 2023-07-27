package com.home.practice.core.java.immutable;

import java.util.HashMap;
import java.util.Map;

public class TestHashMapCustomKeys {

    public static void main(String[] args) {

       testImmutableCustomClass();
       testNonImmutableCustomClass();
    }

    private static void testNonImmutableCustomClass() {
        System.out.println("******************************************************************");
        SimpleNonImmutableClass p1 = new SimpleNonImmutableClass(1, "Ashish");

        Map<SimpleNonImmutableClass, String> map = new HashMap<>();
        map.put(p1, "someValue");

        System.out.println("Value of Map : " + map);
        System.out.println("Hashcode of key : p1 : " + p1.hashCode());


        // change key using setter method
        p1.setName("Harshit");
        System.out.println("After changing name of key to Harshit");
        System.out.println("Value of Map : " + map);
        System.out.println("Hashcode of Map : " + p1.hashCode());

        // Add new object with same key
        // In this case it will insert same key at 2 different hash code location
        SimpleNonImmutableClass p2 = new SimpleNonImmutableClass(1, "Harshit");
        map.put(p2, "someValue");
        System.out.println("Value of Map : " + map);
        System.out.println("Hashcode of Map p2: " + p2.hashCode());
        System.out.println("Hashcode of Map p1: " + p1.hashCode());
        System.out.println("*************************************");
    }

    private static void testImmutableCustomClass() {


        System.out.println("*************************************");
        SimpleImmutableClass p1 = new SimpleImmutableClass(1, "Ashish");

        Map<SimpleImmutableClass, String> map = new HashMap<>();
        map.put(p1, "someValue");

        System.out.println("Value of Map : " + map);
        System.out.println("Hashcode of Key : " + p1.hashCode());

        SimpleImmutableClass p2 = new SimpleImmutableClass(1, "Ashish");
        map.put(p2, "otherValue");
        System.out.println("Value of Map : " + map);
        System.out.println("Hashcode of key : p1 : " + p1.hashCode());
        System.out.println("Hashcode of key : p2 : " + p2.hashCode());
    }
}
