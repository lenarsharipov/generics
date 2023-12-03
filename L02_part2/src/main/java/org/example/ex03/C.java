package org.example.ex03;

public class C<N extends Number> {

    public void doSmth(N n) {
        long x = n.longValue();
    }
}
