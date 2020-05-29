package com.example.demo.controller;


public class ClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(System.getProperty("sun.boot.class.path"));
        System.out.println(System.getProperty("java.ext.dirs"));
        Class<?> aClass = Class.forName("com.example.demo.controller.CountDown");
        System.out.println(aClass.getClassLoader());
        System.out.println(aClass.getClassLoader().getParent());
        System.out.println(aClass.getClassLoader().getParent().getParent());
    }
}
