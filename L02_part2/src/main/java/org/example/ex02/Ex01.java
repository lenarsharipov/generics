package org.example.ex02;

public class Ex01 {
    public static void main(String[] args) {
        B<?> b1 = new B<>(111);
        System.out.println(b1.a.getClass());
    }
}
