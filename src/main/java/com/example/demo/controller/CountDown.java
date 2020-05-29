package com.example.demo.controller;

import java.util.concurrent.CountDownLatch;

public class CountDown {
    public static void main(String[] args) throws InterruptedException {
        //设置countdown为5
        CountDownLatch countDownLatch = new CountDownLatch(5);
        System.out.println("线程第一阶段开始工作");

        for (int i = 0; i < 5; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(100);
                        //计数器-1
                        countDownLatch.countDown();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }.start();
        }
        //直到计数器为0
        countDownLatch.await();
        System.out.println("阶段一全部完成，第二阶段开工");
    }

}
