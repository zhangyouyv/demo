package com.example.demo.cback;

public class Manager implements Callback {

    public void askEmployeeDoSth(Employee employee) throws InterruptedException {
        employee.doSth(this, "取快递");
    }

    @Override
    public void callback() {
        System.out.println("我做完了！");
    }
}
