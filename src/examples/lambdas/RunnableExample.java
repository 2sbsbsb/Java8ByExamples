package examples.lambdas;

/**
 * Comparision of use of Runnable interface in pre-java8 and java8.
 *
 * @author santoshb
 */
public class RunnableExample {


    public static void main(String[] args) {
        RunnableExample re = new RunnableExample();
        re.preJava8();
        re.java8();
    }

    /**
     * preJava8 style
     */
    private void preJava8() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                work();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     * java 8 style
     */
    private void java8() {
        // No boiler-plate code required.
        // Write what you want to do. Functional programming approach.
        // Runnable is a @FunctionalInterface and so can be assigned lambda expression.
        // ()-> work(); - Lambda expression with no arguments
        Runnable runnable = () -> work();
        Thread thread = new Thread(runnable);
        thread.start();
    }

    /**
     *
     */
    private void work() {
        System.out.println("Working");
    }

}
