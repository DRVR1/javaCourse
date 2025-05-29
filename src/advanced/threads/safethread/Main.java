package advanced.threads.safethread;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        // Same as in threadjoin, but i use lambda expression to create the runnable as
        // its a functional interface
        Runnable a = () -> {
            System.out.println("A is running");
            for (int i = 0; i < 100000; i++) {
                bankAccount.addBalance(1);
            }
        };

        Runnable b = () -> {
            System.out.println("B is running");
            for (int i = 0; i < 100000; i++) {
                bankAccount.addBalance(1);
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

        // Wait for the threads to finish before printing the balance

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }

        System.out.println("final balance is: " + bankAccount.getBalance());
    }
}
