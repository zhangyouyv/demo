package com.example.demo.controller;

import java.lang.ClassLoader;

//自定义的classLoader要继承classloader
public class MyClassLoader extends ClassLoader{

    //实现findclass方法

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
