package examples.filter;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * @author santoshb
 */
public class ListFilesWithExtension {


    /**
     * @param extnsion
     * @return
     */
    private static String[] listFilesWithGivenExtensionJava8(File file, String extnsion) {
        // Using lambda expression
        String[] files = file.list((dir, name) -> name.endsWith(extnsion));
        return files;
    }

    /**
     * @param extnsion
     * @return
     */
    private static String[] listFilesWithGivenExtensionPreJava8(File file, String extnsion) {
        // Using pre-java8 way. Instantiating FilenameFilter object
        String[] files = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(extnsion);
            }
        });
        return files;
    }

    private static void test(File file, String extesion) {
        String[] preJava8Files = listFilesWithGivenExtensionPreJava8(file, extesion);
        String[] java8Files = listFilesWithGivenExtensionJava8(file, extesion);
        // One should use JUnit for testing.
        if (Arrays.equals(preJava8Files, java8Files)) {
            System.out.println("Directory " + file.toString() + " has " + java8Files.length + " files with extension " + extesion);
            System.out.println("Test Passed");
        } else {
            System.out.println("Test failed");
        }
    }


    /**
     * @param args Two arguments required
     *             1st argument is directory
     *             2nd argument is the file extension
     */
    public static void main(String[] args) {
        String dir = args[0];
        String extension = args[1];
        File file = new File(dir);
        test(file, extension);
    }

}
