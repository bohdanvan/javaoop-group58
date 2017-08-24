package lesson11.multithreading;

/**
 * @author bvanchuhov
 */
public class Drinker implements Runnable {

    private static int nextId = 0;
    private final int id = nextId++;

    @Override
    public void run() {
        ThreadUtils.println(drinkerInfo() + "Hello");
        for (int beer = 0; beer < 3; beer++) {
            ThreadUtils.println(drinkerInfo() + "I'm drinking " + beer + " beer");
        }
        ThreadUtils.println(drinkerInfo() + "I'm ready");
    }

    private String drinkerInfo() {
        return "I'm " + id + " drinker. ";
    }
}
