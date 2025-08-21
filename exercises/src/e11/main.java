package e11;

public class main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrinterTask(), "Worker-1");
        Thread t2 = new Thread(new PrinterTask(), "Worker-2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }

    }
}

// Create a Java program that launches two threads, each printing a simple
// message five times.

// You need to:

// Create a class PrinterTask that implements Runnable.

// In the run() method, print:

// [Thread-Name]: Running task i

// for i = 1 to 5.

// In the main() method:

// Instantiate PrinterTask once.

// Create two Thread objects using this task, named "Worker-1" and "Worker-2".

// Start both threads.

// Use .join() to ensure the main thread waits for both to finish.

// Expected Output (order may vary):

// Worker-1: Running task 1

// Worker-2: Running task 1

// Worker-1: Running task 2

// Worker-2: Running task 2