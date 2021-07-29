package examples.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Use of Comparator interface in pre-java8 and java8.
 *
 * @author santoshb
 */
public class ComparatorExample {

    /**
     * @return
     */
    private static List<String> populateData() {
        List<String> names = new ArrayList<String>();
        names.add("Harry");
        names.add("Peter");
        names.add("Tom");
        names.add("Lisa");
        names.add("Anthony");
        names.add("Diana");
        return names;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> names = populateData();
        ComparatorExample ce = new ComparatorExample();
        ce.sortPreJava8(names);
        System.out.println(names);
        // Populate the data once again
        names = populateData();
        // Invoke sort with java8
        ce.sortJava8(names);
        System.out.println(names);
    }

    /**
     *
     */
    private void sortPreJava8(List<String> names) {
        Comparator<String> comparator = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        Collections.sort(names, comparator);
    }

    /**
     * java 8 style
     */
    private void sortJava8(List<String> names) {
        // Is Comparator a functional interface ?
        // The interface Comparator is functional because although it declares
        // two abstract methods,
        // one of these—equals— has a signature corresponding to a public method
        // in Object.
        // Interfaces always declare abstract methods corresponding to the
        // public methods of Object, but they usually do so implicitly. Whether
        // implicitly or explicitly declared, such methods are excluded from the
        // count.
        // Read http://www.lambdafaq.org/what-is-a-functional-interface/
        Comparator<String> comparator = (String s1, String s2) -> s1
                .compareTo(s2);
        Collections.sort(names, comparator);
    }

}
