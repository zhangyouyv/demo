package com.example.demo.controller;

import java.util.concurrent.Exchanger;

public class ExchangerTest {


    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<String>();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是t1线程：正在获取来t2线程的数据。。。。。。");
                try {
                    String result = exchanger.exchange("获取到线程1的数据");
                    System.out.println(Thread.currentThread().getName()+result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t1线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是t2线程：正在获取来t1线程的数据。。。。。。");
                try {
                    String result = exchanger.exchange("获取到线程2的数据");
                    System.out.println(Thread.currentThread().getName()+result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"t2线程").start();
    }
}
