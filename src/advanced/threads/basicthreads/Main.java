package advanced.threads.basicthreads;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}
