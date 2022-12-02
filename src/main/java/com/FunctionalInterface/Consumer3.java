package com.FunctionalInterface;
import java.util.function.Consumer;

import java.util.Arrays;
import java.util.List;

public class Consumer3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "ab", "abc");
        forEach(list, (String x) -> System.out.println(x.length()));

    }

    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
