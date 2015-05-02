package examples.mapEnhancements;

import java.util.HashMap;
import java.util.Map;

public class MapEnhancementsUtil {

	public MapEnhancementsUtil() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.compute("A", (k, v) -> (v == null) ? 0 : v + 1);
		map.compute("A", (k, v) -> (v == null) ? 0 : v + 1);
		map.compute("B", (k, v) -> (v == null) ? 0 : v + 1);
		System.out.println(map);
		//
		
	}

}
