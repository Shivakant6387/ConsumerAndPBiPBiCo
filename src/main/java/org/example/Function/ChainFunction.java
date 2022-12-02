package org.example.Function;
import java.util.function.Function;
public class ChainFunction {
    public static void main(String[] args) {
        Function<String,Integer>func=i->i.length();
        Function<Integer,Integer>func2=i->i*2;
        Integer result=func.andThen(func2).apply("mkyong");
        System.out.println(result);
    }
}
