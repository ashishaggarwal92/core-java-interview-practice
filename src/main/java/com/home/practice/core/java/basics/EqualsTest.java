package com.home.practice.core.java.basics;

public class EqualsTest {

    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "A";
        String s3 = new String("A");
        String s4 = new String("A");

        System.out.println(s1==s2); // true
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1==s3); // false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // true
        System.out.println(s3==s4); // false

        // intern method
        s3 = s3.intern();
        System.out.println("After using intern on new object");
        System.out.println(s1==s3);


    }

}
