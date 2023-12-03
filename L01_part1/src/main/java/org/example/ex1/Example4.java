package org.example.ex1;

public class Example4 {
    public static void main(String[] args) {
        Foo<Integer> f1 = new Foo<>();
        f1.x = 10;

        Foo<? extends Number> f2 = new Foo<Integer>(10);
        System.out.println(f2.x);
//        f2.x = 10; // Cannot change the value of x in case we use ? or ? extends Class

        Foo<? super Number> f3 = new Foo<>();
        f3.x = 10;
    }
}
