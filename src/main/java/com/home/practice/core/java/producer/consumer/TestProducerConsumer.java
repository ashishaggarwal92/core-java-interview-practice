package com.home.practice.core.java.producer.consumer;

import java.util.LinkedList;
import java.util.List;

public class TestProducerConsumer {

    public static void main(String[] args) {
        List<Integer> sharedQueue = new LinkedList<>(); //Creating shared object

        Producer producer=new Producer(sharedQueue);
        Consumer consumer=new Consumer(sharedQueue);

        Thread producerThread = new Thread(producer, "ProducerThread");
        Thread consumerThread = new Thread(consumer, "ConsumerThread");
        producerThread.start();
        consumerThread.start();
    }
}
// https://www.javamadesoeasy.com/2015/03/solve-consumer-producer-pattern-by.html