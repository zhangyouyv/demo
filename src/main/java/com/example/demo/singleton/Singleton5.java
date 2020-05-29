package com.example.demo.singleton;

public class Singleton5 {
    private Singleton5(){};
    public static Singleton5 getInstance(){
        return SingletonHolder.sInstance;
    }
    private static class SingletonHolder{
        private static final Singleton5 sInstance = new Singleton5();
    }
}
