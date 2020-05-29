package com.example.demo.controller;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnsafeTest {
    public static void main(String[] args) {
        Unsafe unsafe = getUnsafe();
        System.out.println(unsafe.toString());
    }

    public static Unsafe getUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (Exception e) {
           throw new RuntimeException(e);

        }
    }
}
