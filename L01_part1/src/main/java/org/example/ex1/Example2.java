package org.example.ex1;

public class Example2 {

    public static void main(String[] args) {
        Foo<String> f1 = new Foo<>();
        f1.x = "HELLO";
//        f1.x = 1; // incompatible types: int cannot be converted to java.lang.String

        Foo<Integer> f2 = new Foo<>();
        f2.x = 1;
    }
}
