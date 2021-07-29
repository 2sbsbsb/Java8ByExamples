package examples.CollectionEnhancements;

import java.util.HashSet;
import java.util.Set;

public class CollectionEnhancementsUtil {

    public CollectionEnhancementsUtil() {
        // TODO Auto-generated constructor stub
    }

    /**
     *
     */
    public static void removeIf() {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("AA");
        set.add("B");
        System.out.println(set);
        set.removeIf(s -> s.startsWith("A"));
        System.out.print(set);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        removeIf();
    }

}
