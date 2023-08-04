package com.home.practice.core.java.producer.consumer;

import java.util.List;

public class Producer implements Runnable{

    private List<Integer> sharedQueue;
    private int queueCapacity = 2;

    public Producer(List<Integer> sharedQueue) {
        this.sharedQueue  = sharedQueue;
    }


    @Override
    public void run() {

        for (int i=0; i < 10; i++) {
            try {
                produce(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

    private void produce(int i) throws InterruptedException {

        synchronized (sharedQueue) {
            while (sharedQueue.size() == queueCapacity) {
                System.out.println("Queue is full, producer is waiting for consumer thread to consume");
                sharedQueue.wait();
            }
        }
        synchronized (sharedQueue) {
            System.out.println("Produced : " + i);
            sharedQueue.add(i);
            Thread.sleep(1000);
            sharedQueue.notifyAll();
        }


    }
}
