package com.example.demo.cback;

public class Employee {

    public void doSth(Callback m,String s) throws InterruptedException {
        System.out.println("老板要求你做"+s);

        Thread.sleep(2000);
        m.callback();
    }
}
