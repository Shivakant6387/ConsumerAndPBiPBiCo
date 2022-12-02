package com.Database;

public class AddTwoNumbersUsingBiConsumer {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer>biConsumer=(i,j)-> System.out.println(i+"+"+j+"="+(i+j));
        biConsumer.accept(10,31);
        biConsumer.accept(34,43);
        biConsumer.accept(32,23);
        biConsumer.accept(342,432);
    }
}
