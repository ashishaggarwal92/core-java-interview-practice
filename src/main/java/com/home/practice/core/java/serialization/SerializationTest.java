package com.home.practice.core.java.serialization;

import java.io.*;

public class SerializationTest {

    public static void main(String[] args) {
        Employee object = new Employee("ab", 20, 2, 1000);
        String filename = "abc.txt";

        // Serialization
        try {
            // Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            // Method for serialization of object
            out.writeObject(object);

            out.close();
            file.close();

            System.out.println("Object has been serialized. Data before Deserialization.");
            printData(object);

            // value of static variable changed
            object.b = 2000;
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        object = null;

        // Deserialization
        try {

            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object = (Employee) in.readObject();

            in.close();
            file.close();
            System.out.println("Object has been deserialized Data after Deserialization.");
            // static variable wll point to current value
            // transient will be default value
            printData(object);

            // System.out.println("z = " + object1.z);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("IOException is caught");
        }
    }

    public static void printData(Employee object1) {

        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.age);
        System.out.println("a = " + object1.a);
        System.out.println("b = " + object1.b);
    }
}

