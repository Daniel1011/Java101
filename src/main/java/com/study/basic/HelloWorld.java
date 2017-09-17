package com.study.basic;

public class HelloWorld {

    public void main(String[] args) {
        System.out.println("Hello world" );

        System.out.println("Result1: " + add(1, 2));
        System.out.println("Result2: " + add(3, 4));

    }

    private int add(int a, int b) {
        return a + b;
    }
}
