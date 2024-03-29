package examples.mapEnhancements;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapEnhancementsUtil {

    public MapEnhancementsUtil() {
        // TODO Auto-generated constructor stub
    }

    public static void comput() {
        // TODO Auto-generated method stub
        Map<String, Integer> map = new HashMap<>();
        map.compute("A", (k, v) -> (v == null) ? 0 : v + 1);
        map.compute("A", (k, v) -> (v == null) ? 0 : v + 1);
        map.compute("A", (k, v) -> (v == null) ? 0 : v + 1);
        map.compute("A", (k, v) -> (v == null) ? 0 : v + 1);
        map.compute("B", (k, v) -> (v == null) ? 0 : v + 1);
        System.out.println(map);
        //
    }

    public static void computIfAbsent() {
        Map<String, Integer> map = new HashMap<>();
        Function<String, Integer> f1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String t) {
                System.out.println("f1: Received " + t);
                Integer i = 0;
                System.out.println("f1: Returning " + i);
                return i;
            }
        };
        Integer i;
        i = map.get("A");
        System.out.println(i);
        i = map.computeIfAbsent("A", f1);
        System.out.println(i);
        i = map.get("A");
        System.out.println(i);
    }

    public static void computIfPresent() {
        Map<String, Integer> map = new HashMap<>();
        BiFunction f1 = new BiFunction() {
            @Override
            public Object apply(Object k, Object v) {
                System.out.println("f1: Received " + k + " and " + v);
                Integer i = 0;
                System.out.println("f1: Returning " + i);
                return i;
            }
        };
        map.put("A", 1);
        Integer i;
        i = map.get("A");
        System.out.println(i);
        i = map.computeIfPresent("A", f1);
        System.out.println(i);
        i = map.get("A");
        System.out.println(i);
    }

    public static void forEach() {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.forEach((k, v) -> System.out.println("Key : " + k + ", value :" + v));
    }

    public static void main(String[] args) {
        comput();
        computIfAbsent();
        computIfPresent();
        forEach();
    }

}
