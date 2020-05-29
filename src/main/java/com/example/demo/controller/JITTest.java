package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicBoolean;

public class JITTest {
    public static AtomicBoolean  INIT = new AtomicBoolean(false);
    public static void main(String[] args) throws InterruptedException {
        new Thread(){
            @Override
            public void run() {
                while (!INIT.get()){
                }
            }
        }.start();
        Thread.sleep(1000);

        new Thread(){
            @Override
            public void run() {
                System.out.println("修改初始值为true！");
                INIT.set(true);
            }
        }.start();
    }
}
