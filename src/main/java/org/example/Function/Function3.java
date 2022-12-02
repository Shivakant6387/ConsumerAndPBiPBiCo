package org.example.Function;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function3 {


    public static void main(String[] args) {
        Function3 obj=new Function3();

        List<String> list = Arrays.asList("node", "c++", "java", "javascript");

        List<String> result = obj.map(list, obj::sha256);

        result.forEach(System.out::println);

    }

    public <T, R> List<R> map(List<T> list, Function<T, R> func) {

        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(func.apply(t));
        }
        return result;

    }

    public String sha256(String str) {
        return DigestUtils.sha256Hex(str);
        //return str.toUpperCase();


    }
}
