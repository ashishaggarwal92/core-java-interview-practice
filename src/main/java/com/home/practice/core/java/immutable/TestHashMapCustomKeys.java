package com.home.practice.core.java.immutable;

import java.util.HashMap;
import java.util.Map;

public class TestHashMapCustomKeys {

    public static void main(String[] args) {

       testImmutableCustomClass();
       testNonImmutableCustomClassGet();
       testNonImmutableCustomClassPut();    }

    private static void testImmutableCustomClass() {


        System.out.println("*************************************");
        System.out.println("****  Test Immutable    *************");

        Map<SimpleImmutableClass, String> map = new HashMap<>();

        // Put First value in Hash map
        SimpleImmutableClass p1 = new SimpleImmutableClass(1, "Ashish");
        map.put(p1, "someValue");

        // Put Second value in Hash map with same key and different value
        SimpleImmutableClass p2 = new SimpleImmutableClass(1, "Ashish");
        map.put(p2, "otherValue");

        // This will return only one value with the latest override of the value
        System.out.println("Value of Map : " + map);

        // This will always be true
        System.out.println("Hashcode of both key should be same : " + (p1.hashCode() == p2.hashCode()));
        System.out.println("*************************************");
    }

    private static void testNonImmutableCustomClassGet() {
        System.out.println("*************************************");
        System.out.println("****  Test Mutable GET  *************");

        Map<SimpleNonImmutableClass, String> map = new HashMap<>();

        // Put First value in Hash map
        SimpleNonImmutableClass key = new SimpleNonImmutableClass(1, "Ashish");
        map.put(key, "someValue");

        System.out.println("Key is before Update: " + key + " Hash code of key is: " + key.hashCode());
        // change key using setter method
        key.setName("Harshit");
        // Hash code will change
        System.out.println("Key is after Update : " + key + " Hash code of key is: " + key.hashCode());

        // This will return false
        System.out.println("Hash Map contains : " + map);
        System.out.println("Key should not be found in the map : " + key + " check present : " + map.containsKey(key));
        System.out.println("Hash Map " + map);
        // This is a data leak as we are not able to found the key in the hashmap

        System.out.println("*************************************");
    }

    private static void testNonImmutableCustomClassPut() {
        System.out.println("*************************************");
        System.out.println("****  Test Mutable PUT  *************");

        Map<SimpleNonImmutableClass, String> map = new HashMap<>();

        // Put First value in Hash map
        SimpleNonImmutableClass p1 = new SimpleNonImmutableClass(1, "Ashish");
        map.put(p1, "someValue");


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


}
