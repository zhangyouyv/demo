package com.example.demo.controller;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest1 {

    static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    lock.lock();
                    while (true){
                        System.out.println("=========");
                    }
                }finally {
                    lock.unlock();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    lock.lock();
                    while (true){
                        System.out.println("**********");
                    }
                }finally {
                    lock.unlock();
                }
            }
        });
        t1.start();
        t2.start();

        t2.interrupt();
    }
}
