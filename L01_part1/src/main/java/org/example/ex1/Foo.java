package org.example.ex1;

public class Foo<T> {

    T x;

    public Foo() {
    }

    public Foo(T x) {
        this.x = x;
    }

    public void printX() {
        System.out.println(this.x);
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

//    Not possible to set static methods with
//    generic types as static members are loaded first
//    static void m1(T x) {
//    }
}
