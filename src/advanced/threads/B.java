package advanced.threads;

public class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("im b");

        }
    }
}
