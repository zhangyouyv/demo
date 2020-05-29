package com.example.demo.controller;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantLockTest {
    static ReentrantLock lock =  new ReentrantLock();
    static ReentrantReadWriteLock rwlock =  new ReentrantReadWriteLock();


    public static void main(String[] args) {
        new Thread(()->test(),"线程1").start();
        new Thread(()->test(),"线程2").start();
        new Thread(()->test(),"线程3").start();
        new Thread(()->test(),"线程4").start();
        new Thread(()->test(),"线程5").start();

    }

    public static void test(){
        try{
            rwlock.readLock().lock();
            System.out.println(Thread.currentThread().getName()+"获取到了锁");
        }finally{
            lock.unlock();
        }
    }
}
