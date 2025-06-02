package advanced.threads.safethread;

public class BankAccount {
    private int balance = 0;

    public synchronized void addBalance(int balance) {
        this.balance += balance;
    }

    public int getBalance() {
        return balance;
    }

}
