package org.example.Function;

public class javaMemory {
    public static void main(String[] args) {
        Function<String ,Integer>func=x->x.length();
        Integer appply= func.apply("mkyong");
        System.out.println(appply);
    }
}
