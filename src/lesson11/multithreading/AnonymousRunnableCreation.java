package lesson11.multithreading;

/**
 * @author bvanchuhov
 */
public class AnonymousRunnableCreation {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadUtils.println("1");
            }
        }).start();

        ThreadUtils.println("2");

    }
}
