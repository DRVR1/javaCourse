package advanced.threads.runnablethreads;

public class A implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("A");
        }
    }
}
