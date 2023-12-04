package com.java.example3;

public class A {

    <T> T m1() {
        return null;
    }

    <T> void m2(T t) {
        System.out.println(t);
    }

    static <T> void smth(T a, Class<T> c) {
        // does smth
    }

    public static void main(String[] args) {
        smth(10, Integer.class);
    }

}