package com.example.demo.controller;

public class AppTest{
        public static void main(String[] arg){
//        Person person = new Person("张三");
//        person.sayHello();

    String A="abc";
    String B="abc";
    String C=new String("abc");
    String D=new String("abc");
    String E="ab"+"c";

    System.out.println(A==B);
    System.out.println(C==D);
    System.out.println(A==C);
    System.out.println(B==E);
        }

        }
