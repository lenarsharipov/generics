package org.example.ex1;

public class Example1 {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        f1.x = 5;
        System.out.println(f1.x.getClass());

        Foo f2 = new Foo();
        f2.x = "Hello";

        // ------------
        int x1 = (int) f1.x;
        int x2 = (int) f2.x; // ClassCastException
    }
}
