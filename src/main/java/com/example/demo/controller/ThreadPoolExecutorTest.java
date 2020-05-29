package com.example.demo.controller;

import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolExecutorTest {
    static ExecutorService threadpool = new ThreadPoolExecutor(
            3,
            20,
            1,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(5),
            new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 15; i++) {
            threadpool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("当前线程是"+Thread.currentThread().getName());
                }
            });
        }

        //threadpool.shutdown();
        //threadpool.awaitTermination(1, TimeUnit.SECONDS);
        List<Runnable> runnables = threadpool.shutdownNow();
        for (Runnable R:runnables
             ) {
            System.out.println(R);
        }

        System.out.println("线程池关闭了");
    }

   /* class Task implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+"在运行");
        }
    }*/
}
