package com.Database;

import com.data.com.Consumer;

public class DifferenceInConsumerAndBiConsumer {
    public static void main(String[] args) {
        Consumer<Integer>consumer=integer -> System.out.println("Square of "+integer+"is: "+integer*integer);
        BiConsumer<Integer,Integer>biConsumer=(i, j) -> System.out.println("Sum of ("+i+","+j+") is :"+(i+j));
        System.out.println("Consumer testing  for printing Square value :\n");
        consumer.accept(8);
        consumer.accept(25);
        consumer.accept(9);
        consumer.accept(19);
        System.out.println("\n BiConsumer testing for both numbers :\n");
        biConsumer.accept(32,32);
        biConsumer.accept(35,65);
        biConsumer.accept(345,654);
    }
}
