package com.example.demo.controller;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.concurrent.*;

public class ExecutorsTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future future= executorService.submit(new MyCallable());
        //FutureTask<Object> futureTask = new FutureTask<>(new MyCallable());
        //Thread thread = new Thread(futureTask);
        //thread.start();
        //System.out.println("核心数："+Runtime.getRuntime().availableProcessors());
        //System.out.println(future.get());

        //MyCallable myCallable =new MyCallable();
        //System.out.println(futureTask.get());
        //ConcurrentLinkedQueue
        System.out.println(future.get());
    }

    static class MyCallable implements Callable{

        @Override
        public Object call() throws Exception {
            return Thread.currentThread().getName();
        }
    }
}
