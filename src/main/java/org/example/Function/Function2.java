package org.example.Function;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Function2 {
    public static void main(String[] args) {
        Function2 obj = new Function2();

        List<String> list = Arrays.asList("node", "c++", "java", "javascript");

        Map<String, Integer> map = obj.convertListToMap(list, x -> x.length());

        System.out.println(map);
        Map<String, Integer> map2 = obj.convertListToMap(list, obj::getLength);

        System.out.println(map2);
    }

    public <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {

        Map<T, R> result = new HashMap<>();
        for (T t : list) {
            result.put(t, func.apply(t));
        }
        return result;

    }
    public Integer getLength(String str) {
        return str.length();
    }
}