package com.home.practice.core.java.multithreading;

public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Inside run of thread "+Thread.currentThread());
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        Thread thread1 = new Thread(myThread);
        thread1.start();
        thread.start();
    }
}
