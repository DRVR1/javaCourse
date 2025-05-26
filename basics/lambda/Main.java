package basics.lambda;

public class Main {
    public static void main(String[] args) {
        A a = new A() {
            public void show() {
                System.out.println("show");
            }
        };
    }
}
