package com.example.demo.singleton;

public class Singleton3 {

    private static Singleton3 instance;
    private Singleton3(){
    }

    public static synchronized Singleton3 getInstance(){
        if(instance==null){
            instance = new Singleton3();
            return instance;
        }
        return instance;
    }

}
