package org.example.ex04;

public class Main {
    public static void main(String[] args) {
        D<String, Integer> d1 = new D<>();
        D<String, Integer> d2 = new D<String, Integer>();
        D<?, Integer> d3 = new D<String, Integer>();
        D<?, ? extends Number> d4 = new D<String, Integer>();
    }
}
