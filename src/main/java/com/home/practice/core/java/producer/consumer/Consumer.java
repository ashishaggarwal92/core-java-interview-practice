package com.home.practice.core.java.producer.consumer;

import java.util.List;

public class Consumer implements Runnable{

    private List<Integer> sharedQueue;

    public Consumer(List<Integer> sharedQueue) {
        this.sharedQueue  = sharedQueue;
    }


    @Override
    public void run() {

        while(true) {
            try {
                consume();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

    private void consume() throws InterruptedException {

        synchronized (sharedQueue) {
            while (sharedQueue.size() == 0) {
                System.out.println("Queue is empty, consumer is waiting for producer thread to produce");
                sharedQueue.wait();
            }
        }
        synchronized (sharedQueue) {
            Thread.sleep(1000);
            System.out.println("Consumed : " + sharedQueue.remove(0));
            sharedQueue.notifyAll();
        }


    }
}
