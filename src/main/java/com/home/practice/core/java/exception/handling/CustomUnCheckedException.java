package com.home.practice.core.java.exception.handling;

public class CustomUnCheckedException extends RuntimeException {

    public CustomUnCheckedException(String message) {
        super(message);
    }

    public CustomUnCheckedException(String message, Throwable err) {
        super(message, err);
    }
}
