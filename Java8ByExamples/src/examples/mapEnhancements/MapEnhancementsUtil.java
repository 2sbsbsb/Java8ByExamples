package examples.mapEnhancements;

import java.util.HashMap;
import java.util.Map;
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

	public static void main(String[] args) {
		comput();
		computIfAbsent();
	}

}
