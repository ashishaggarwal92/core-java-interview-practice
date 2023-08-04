package com.home.practice.core.java.singleton;

public class SingletonEagerInit {

    private static SingletonEagerInit instance = new SingletonEagerInit();

    private SingletonEagerInit() {

    }

    public static synchronized SingletonEagerInit getInstance() {
        return instance;
    }


}
