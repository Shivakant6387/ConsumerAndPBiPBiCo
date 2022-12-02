package org.example;

public class PrintUsingConsumerFI {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);

        // invoke Consumer FI for below String values
        c.accept("Welcome to");
        c.accept("Java 8 world");
        c.accept("for beginners");
        c.accept("@ BenchResources.Net");
        c.accept("and also learn Java stacks here");
    }
}
