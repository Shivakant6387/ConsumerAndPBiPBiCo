package com.FunctionalInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BiConsumer5 {
    public static void main(String[] args) {
        Map<Integer,String>map=new LinkedHashMap<>();
        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"C++");
        map.put(4,"JavaScript");
        map.put(5,"PHP");
        map.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
