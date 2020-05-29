package com.example.demo.controller;

import java.util.concurrent.*;

public class CyclicBarrierTest {
    public static CyclicBarrier cyclicBarrier =new CyclicBarrier(2, new Runnable() {
        @Override
        public void run() {
            System.out.println("两个线程都执行完了");
        }
    });

    public static void getInCar(){
        System.out.println("乘客上车了,乘客是："+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
       Thread t1 = new Thread(){
            @Override
            public void run() {

                try {
                    Thread.sleep(20000);
                    getInCar();
                    try {
                        cyclicBarrier.await();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                getInCar();
                try {
                    Thread.sleep(200);
                    try {
                        cyclicBarrier.await();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println();
            }
        };
        t1.start();
        t2.start();

        }
}
