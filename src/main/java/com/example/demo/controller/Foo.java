package com.example.demo.controller;

import static sun.misc.PostVMInitHook.run;

public class Foo {
    public void one() {
        System.out.println("one");
    }

    public void two() {
        System.out.println("two");
    }

    public void three() {
        System.out.println("three");
    }

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                foo.one();
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                foo.two();
            }
        };
        Thread t3 = new Thread() {
            @Override
            public void run() {
                foo.three();
            }
        };
//相當於單線程
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

    }
}

