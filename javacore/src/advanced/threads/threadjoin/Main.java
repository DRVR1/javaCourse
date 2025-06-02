package advanced.threads.threadjoin;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        Runnable a = new Runnable() {
            public void run() {
                System.out.println("A is running");
                for (int i = 0; i < 100000; i++) {
                    bankAccount.balance++;
                }
            }
        };

        Runnable b = new Runnable() {
            public void run() {
                System.out.println("B is running");
                for (int i = 0; i < 100000; i++) {
                    bankAccount.balance++;
                }
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        try {
            System.out.println("Starting A");
            t1.start();
            t1.join();
            System.out.println("A has finished");
            System.out.println("Starting B");
            t2.start();
            t2.join();
            System.out.println("B has finished");

        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println("final balance is: " + bankAccount.balance);
    }
}
