package advanced.test;

public class Main {

    int a = 5;

    A obj = () -> {

        System.out.println(this.a);
    };

    public static void main(String[] args) {

        obj.run();

    }

}

interface A {

    public void run();

}