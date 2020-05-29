package com.example.demo.cback;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Manager c = new Manager();
        Employee employee = new Employee();
        c.askEmployeeDoSth(employee);
    }
}
