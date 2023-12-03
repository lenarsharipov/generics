package org.example.ex1;

public class Example3 {
    public static void main(String[] args) {
        Foo<Integer> f1;
        Foo<?> f2; // any object wildcard
        Foo<? extends Number> f3; // object extending Number abstract class wildcard
        Foo<? super Number> f4;
        Foo<Number> f5;

        f1 = new Foo<>();
        f5 = new Foo<Number>();

        // Foo<? extends Number> f3
        f3 = new Foo<Integer>();
        f3 = new Foo<Byte>();
        f3 = new Foo<Double>();

        // Foo<? super Number> f4;
        f4 = new Foo<Number>();
        f4 = new Foo<Object>();

        // Foo<?> f2; // any object wildcard
        f2 = new Foo<String>();
        f2 = new Foo<Integer>();

    }

    static Foo<Integer> m1() {
        return null;
    }

}
