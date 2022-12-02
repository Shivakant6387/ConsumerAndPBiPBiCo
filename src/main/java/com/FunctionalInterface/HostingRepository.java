package com.FunctionalInterface;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class HostingRepository {
    public static List<Hosting>filterHosting(List<Hosting>hosting,Predicate<Hosting>predicate){
            return hosting.stream().filter(predicate).collect(Collectors.toList());
    }
}
