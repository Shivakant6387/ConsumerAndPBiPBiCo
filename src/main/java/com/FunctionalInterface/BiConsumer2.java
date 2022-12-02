package com.FunctionalInterface;

import com.Database.BiConsumer;

public class BiConsumer2 {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer>addTwo=(a,b)-> System.out.println(a+b);
        addTwo.accept(32,4423);
        BiConsumer<Integer,Integer>multiTwo=(x,y)-> System.out.println(x*y);
        multiTwo.accept(8,8);
        BiConsumer<String ,String>addTwostr=(a,b)-> System.out.println(a+" "+b);
        addTwostr.accept("Shiva","Singh");
        BiConsumer<String ,String>Str=(s,p)-> System.out.println(s+" "+p);
        Str.accept("Sakshi","Mishra");
    }
}
